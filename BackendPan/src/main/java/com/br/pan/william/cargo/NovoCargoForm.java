package com.br.pan.william.cargo;

import javax.validation.constraints.NotBlank;

public class NovoCargoForm {
    @NotBlank
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Cargo toModel() {
        return new Cargo(this.nome);
    }
}
