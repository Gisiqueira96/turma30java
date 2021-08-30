package com.lojagames.LojaGame.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojagames.LojaGame.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List<Categoria> findAllByGeneroContainingIgnoreCase(String tipo);
}
