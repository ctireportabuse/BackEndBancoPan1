package com.br.pan.william.cargo;

import javax.persistence.*;

@Entity
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

  @Column(nullable = false)
    private String nome;

    public Cargo(String nome) {
        this.nome = nome;
    }


}
