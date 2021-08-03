package com.generation.farmaciaGeneration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.farmaciaGeneration.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{//Long é uma classe que faz algum tipo de pesquisa, talvez por ID
	
	public List<Categoria> findAllByDescricaoContainingIgnoreCase (String descricao); //criação do método, depois eu vou usar para fazer o filtro
}   //vai fazer uma lista puxando os itens da cateogira pela descrição, mas poderia ser pelo tipo tmb
