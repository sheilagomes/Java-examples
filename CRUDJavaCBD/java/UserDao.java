package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.User;
import util.DbUtil;

public class UserDao {

    private Connection connection;

    public UserDao() {
        connection = DbUtil.getConnection();
    }

    public void addUser(User user) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into pessoas(id, nome, prof, local) values (?, ?, ?, ?)");
            preparedStatement.setInt(1, user.getId());
            preparedStatement.setString(2, user.getNome());
            preparedStatement.setString(3, user.getProf());
            preparedStatement.setString(4, user.getLocal());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(int id) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from pessoas where id=?");
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(User user) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update pessoas set id=?, nome=?, prof=?, local=? where id=?");
            preparedStatement.setInt(1, user.getId());
            preparedStatement.setString(2, user.getNome());
            preparedStatement.setString(3, user.getProf());
            preparedStatement.setString(4, user.getLocal());
            preparedStatement.setInt(5, user.getId());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<User> getAllUsers() {
        List<User> listaDeUsuario = new ArrayList<User>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from pessoas");
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setNome(rs.getString("nome"));
                user.setProf(rs.getString("prof"));
                user.setLocal(rs.getString("local"));
                listaDeUsuario.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaDeUsuario;
    }

    public User getUserById(int id) {
        User user = new User();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from pessoas where id=?");
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                user.setId(rs.getInt("id"));
                user.setNome(rs.getString("nome"));
                user.setProf(rs.getString("prof"));
                user.setLocal(rs.getString("local"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }
}