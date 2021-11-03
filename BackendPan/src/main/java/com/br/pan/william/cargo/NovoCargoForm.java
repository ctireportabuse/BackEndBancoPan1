package com.br.pan.william.cargo;

import com.br.pan.william.departamento.Departamento;

import javax.persistence.EntityManager;
import javax.validation.constraints.NotBlank;

public class NovoCargoForm {

    @NotBlank
    private String nome;

    private Long departamento;


    public NovoCargoForm(String nome, Long departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }

    public Cargo toModel(EntityManager entityManager) {
        Departamento departamentoId = entityManager.find(Departamento.class, departamento);
        return new Cargo(this.nome, departamentoId);
    }

    public String getNome() {
        return nome;
    }

    public Long getDepartamento() {
        return departamento;
    }
}
