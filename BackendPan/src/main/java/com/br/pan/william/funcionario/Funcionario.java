package com.br.pan.william.funcionario;

import com.br.pan.william.cargo.Cargo;
import com.br.pan.william.endereco.Endereco;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nome;

    @Column(nullable = false, columnDefinition = "DECIMAL(7, 2) DEFAULT 0.00")
    private BigDecimal salario;

    @Column(name = "data_entrada", nullable = false, columnDefinition = "DATE")
    private LocalDate dataEntrada;

    @Column(name = "data_saida", columnDefinition = "DATE")
    private LocalDate dataSaida;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

     @OneToOne
    private Cargo cargo;

    public Funcionario(String nome, BigDecimal salario, LocalDate dataEntrada, Endereco endereco, Cargo cargo) {
        this.nome = nome;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.endereco = endereco;
        this.cargo = cargo;
    }

}
