package com.br.pan.william.funcionario;

import com.br.pan.william.cargo.Cargo;
import com.br.pan.william.endereco.Endereco;


import java.math.BigDecimal;
import java.time.LocalDate;

public class DetalharFuncionarioResponse {
    private Long id;

    private String nome;

    private BigDecimal salario;

    private LocalDate dataEntrada;

    private LocalDate dataSaida;

    private Endereco endereco;

    private Cargo cargo;


    public DetalharFuncionarioResponse(Funcionario funcionario) {
        this.id = funcionario.getId();
        this.nome = funcionario.getNome();
        this.salario = funcionario.getSalario();
        this.dataEntrada = funcionario.getDataEntrada();
        this.dataSaida = funcionario.getDataSaida();
        this.endereco = funcionario.getEndereco();
        this.cargo = funcionario.getCargo();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Cargo getCargo() {
        return cargo;
    }
}