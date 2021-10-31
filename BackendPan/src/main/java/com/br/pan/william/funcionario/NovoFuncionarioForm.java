package com.br.pan.william.funcionario;

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

    public NovoFuncionarioForm(LocalDate dataEntrada, String nome, BigDecimal salario) {
        this.dataEntrada = dataEntrada;
        this.nome = nome;
        this.salario = salario;

    }

    public Funcionario toModel() {
           return new Funcionario(this.nome, this.salario, this.dataEntrada);
       }
   }
