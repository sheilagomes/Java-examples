package com.gft.apieventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gft.apieventos.domain.Venda;

@Repository
public interface Vendas extends JpaRepository<Venda, Long> {

}

