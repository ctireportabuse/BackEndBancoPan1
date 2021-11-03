package com.br.pan.william.funcionario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/funcionarios")
public class ListarFuncionarioController {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @GetMapping
    public List<ListaFuncionrioResponse> funcionarios(){
        List<Funcionario>funcionarioList = funcionarioRepository.findAll();

        return ListaFuncionrioResponse.toModeList(funcionarioList);

    }


}
