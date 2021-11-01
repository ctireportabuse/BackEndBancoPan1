package com.br.pan.william.funcionario;

import com.br.pan.william.cargo.Cargo;
import com.br.pan.william.endereco.Endereco;

import javax.persistence.EntityManager;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDate;

public class NovoFuncionarioForm {

    private LocalDate dataEntrada;

     @NotBlank
    private String nome;

    @DecimalMin(value = "0.0", inclusive = false)
    private BigDecimal salario;

    private LocalDate dataSaida;

    private Long enderecoId;

    private Long cargoId;

    public NovoFuncionarioForm(LocalDate dataEntrada, String nome, BigDecimal salario, Long enderecoId, Long cargoId ) {
        this.dataEntrada = dataEntrada;
        this.nome = nome;
        this.salario = salario;
        this.enderecoId = enderecoId;
        this.cargoId =cargoId;

    }

    public Funcionario toModel(EntityManager entityManager) {

        Endereco endereco = entityManager.find(Endereco.class, enderecoId);

        Cargo cargo = entityManager.find(Cargo.class, cargoId);


           return new Funcionario(this.nome, this.salario, this.dataEntrada, endereco,cargo);
       }
   }
