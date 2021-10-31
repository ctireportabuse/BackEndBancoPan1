package com.br.pan.william.endereco;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class NovoEnderecoForm {

    @NotBlank
    private String logradouro;

    @NotNull
    private Integer numero;

    private String complemento;

     @NotBlank
    private String cep;

    @NotBlank
    private String bairro;

    @NotBlank
    private String cidade;

    public NovoEnderecoForm(String logradouro, Integer numero, String complemento, String cep, String bairro, String cidade) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
    }


    public Endereco toModel() {
        return new Endereco(this.logradouro, this.numero, this.complemento, this.cep, this.bairro, this.cidade);
    }
}
