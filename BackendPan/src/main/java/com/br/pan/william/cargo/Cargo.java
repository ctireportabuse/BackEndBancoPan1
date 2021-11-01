package com.br.pan.william.cargo;

import com.br.pan.william.departamento.Departamento;
import com.br.pan.william.funcionario.Funcionario;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

  @Column(nullable = false)
    private String nome;

  @ManyToOne
  private Departamento departamento;



  @OneToMany(mappedBy = "cargo")
  List<Funcionario> funcionarios = new ArrayList<>();

    @Deprecated
    public Cargo() {
    }

    public Cargo(String nome, Departamento departamento) {
        this.nome = nome;
        this.departamento=departamento;
    }




}
