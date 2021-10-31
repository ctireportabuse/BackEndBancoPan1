package com.br.pan.william.departamento;

import javax.validation.constraints.NotBlank;

public class NovoDepartamentoForm {

    @NotBlank
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Departamento toModel() {
        return new Departamento(this.nome);
    }
}
