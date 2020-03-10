package com.gft.apieventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gft.apieventos.domain.Casa;
import java.lang.String;
import java.util.List;

@Repository
public interface Casas extends JpaRepository<Casa, Long> {
	Casa findByNome(String nome);
}
