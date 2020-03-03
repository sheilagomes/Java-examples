package com.gft.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gft.socialbooks.domain.Comentario;

public interface ComentariosRepo extends JpaRepository<Comentario, Long>{
	
}
