package com.gft.apifinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gft.apifinal.domain.Casa;

@Repository
public interface Casas extends JpaRepository<Casa, Long> {
	Casa findByNome(String nome);
}
