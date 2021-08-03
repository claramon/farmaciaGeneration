package com.generation.farmaciaGeneration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.farmaciaGeneration.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	public List<Produto> findAllByNomeContainingIgnoreCase (String nome); //criação do método, depois eu vou usar para fazer o filtro
}   //vai fazer uma lista puxando os itens da cateogira pela descrição, mas poderia ser pelo tipo tmb

