package com.br.pan.william.departamento;

import com.br.pan.william.cargo.Cargo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

   @OneToMany(mappedBy = "departamento")
    List<Cargo> cargo =new ArrayList<>();

    @Deprecated
    public Departamento() {
    }

    public Departamento(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
