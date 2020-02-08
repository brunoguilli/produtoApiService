package com.produtos.apirest.models;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

// Entidade do banco de dados
@Entity
// Nome da tabela
@Table(name = "TB_PRODUTO")
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;

    // Id do banco de dados
    @Id
    // Indica pro banco que vai criar automaticamente os ids
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;
    private BigDecimal quantidade;
    private BigDecimal valor;

    // Botão direito: Generate getters and sertters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
