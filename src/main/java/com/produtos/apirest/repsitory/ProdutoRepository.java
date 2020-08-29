package com.produtos.apirest.repsitory;

import com.produtos.apirest.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    Produto findById(long id);
}
