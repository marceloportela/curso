package com.m4u.curso.controller;
import com.m4u.curso.model.*;
import com.m4u.curso.services.EnderecoServices;
import com.m4u.curso.services.EstudanteServices;
import com.m4u.curso.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class Controller {
@Autowired
    private EstudanteServices estudanteServices;
    private UserServices userServices;
    private EnderecoServices enderecoServices;

    @GetMapping("/users")
public ResponseEntity<List<Estudante>> getAllEstudante() {
        return ResponseEntity.ok(estudanteServices.getEstudanteList());
    }
    @GetMapping("/estudante/{id}")
    public ResponseEntity<Estudante> getEstudanteById(@PathVariable int id){
        return ResponseEntity.ok().body(this.estudanteServices.getEstudanteById(id));
    }
    @PostMapping("add")

    public ResponseEntity<Estudante> addEstudante(@RequestBody Estudante estudante) {
        return ResponseEntity.ok(this.estudanteServices.createEstudante(estudante));

    }
    @PutMapping("/update/estudante")
    public ResponseEntity<Estudante> updateUser(@RequestBody Estudante estudante){
        return ResponseEntity.ok().body(this.estudanteServices.updateEstudanteById(estudante));
    }


        @DeleteMapping("/delete/{id}")

    public HttpStatus deleteUser(@PathVariable int id) {
        this.estudanteServices.deleteEstudanteById(id);
        return HttpStatus.OK;
    }
}
