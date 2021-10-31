package com.br.pan.william.funcionario;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/funcionario")
public class FuncionarioController {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<?>criarFuncionario(@RequestBody @Valid NovoFuncionarioForm request){

        Funcionario funcionario = request.toModel();

        funcionarioRepository.save(funcionario);

        return ResponseEntity.ok().build();


    }

}
