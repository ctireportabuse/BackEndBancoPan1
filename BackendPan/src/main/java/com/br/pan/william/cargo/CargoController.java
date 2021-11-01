package com.br.pan.william.cargo;

import com.br.pan.william.departamento.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/cargo")
public class CargoController {

    @Autowired
    private CargoRepository repository;

    @PersistenceContext
    EntityManager entityManager;


    @PostMapping
    @Transactional
    public ResponseEntity<?>criarCargo(@RequestBody @Valid NovoCargoForm request){

        Cargo cargo = request.toModel(entityManager);

        repository.save(cargo);

        return ResponseEntity.ok().build();

    }
}
