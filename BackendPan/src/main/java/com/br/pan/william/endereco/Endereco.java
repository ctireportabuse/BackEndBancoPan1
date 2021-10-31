package com.br.pan.william.endereco;

import javax.persistence.*;

@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String logradouro;

    @Column(nullable = false, length = 5)
    private Integer numero;


    private String complemento;

     @Column(nullable = false , length = 10)
    private String cep;

    @Column(nullable = false)
    private String bairro;

    @Column(nullable = false)
    private String cidade;

    public Endereco(String logradouro, Integer numero, String complemento, String cep, String bairro, String cidade) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
    }



}
