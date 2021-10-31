package com.br.pan.william.departamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/departamento")
public class DepartamentoController {

    @Autowired
    private DepartamentoRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity<?>criarDepartamento(@RequestBody @Valid NovoDepartamentoForm request){

        Departamento departamento = request.toModel();
        repository.save(departamento);

        return ResponseEntity.ok().build();




    }



}
