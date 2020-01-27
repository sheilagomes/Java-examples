package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Portfolio", urlPatterns = {"/Controller"})
public class Controller extends HttpServlet {
    private static String HOME = "/home.jsp";
    private static String SKILLS = "/skills.jsp";
    private static String PROJETOS = "/projetos.jsp";
    private static String CONTATOS = "/contatos.jsp";

    public Controller() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward="";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("home")){
            forward = HOME;
        } else if (action.equalsIgnoreCase("skills")){
            forward = SKILLS;
        } else if (action.equalsIgnoreCase("projetos")){
            forward = PROJETOS;
        } else if (action.equalsIgnoreCase("contatos")){
            forward = CONTATOS;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }
}