package com.br.pan.william.funcionario;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RestController
@RequestMapping(value = "/api/funcionario/{id}")
public class DetalharFuncionarioController {

    @PersistenceContext
    private EntityManager manager;


     @GetMapping
    public ResponseEntity<?>buscarFuncionario(@PathVariable("id") Long id){

        Funcionario funcionario = manager.find(Funcionario.class, id);
        if(funcionario== null){
            return ResponseEntity.notFound().build();
        }
        DetalharFuncionarioResponse detalharFuncionarioResponse = new DetalharFuncionarioResponse(funcionario);

        return ResponseEntity.ok(detalharFuncionarioResponse);
    }

}
