package br.com.pdv.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pdv.entidades.ProdutoEntidade;

@Repository
public interface ProdutosRepository extends JpaRepository<ProdutoEntidade, Long>{

}