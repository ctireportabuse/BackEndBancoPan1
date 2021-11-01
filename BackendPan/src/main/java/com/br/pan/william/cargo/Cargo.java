package com.br.pan.william.cargo;

import com.br.pan.william.departamento.Departamento;

import javax.persistence.*;

@Entity
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

  @Column(nullable = false)
    private String nome;

  @ManyToOne
  private Departamento departamento;

    public Cargo(String nome, Departamento departamento) {
        this.nome = nome;
        this.departamento=departamento;
    }


}
