package com.gft.apifinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gft.apifinal.domain.Venda;

@Repository
public interface Vendas extends JpaRepository<Venda, Long> {

}

