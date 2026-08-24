package com.grijp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Define a classe Servico como uma entidade JPA, representando uma tabela no banco de dados,
// com ID gerado automaticamente e campos para nome e descrição do serviço.

@Entity
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String descricao;
}
