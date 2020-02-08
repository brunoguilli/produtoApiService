package com.produtos.apirest.repository;

import com.produtos.apirest.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

// repository: Já possui varios metodos prontos para fazer operações no banco de dados
public interface ProdutoRepository extends JpaRepository<Produto,Long> {

    Produto findById(long id);

}
