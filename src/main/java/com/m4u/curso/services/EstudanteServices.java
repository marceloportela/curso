package com.m4u.curso.services;
import com.m4u.curso.model.Estudante;
import com.m4u.curso.repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EstudanteServices {
    @Autowired
    private EstudanteRepository estudanteRepository;
    private UserServices userServices;


    public Estudante createEstudante (Estudante estudante){
            return estudanteRepository.save(estudante);
    }
    public List<Estudante>getEstudanteList(){
        return estudanteRepository.findAll();
    }
    public Estudante getEstudanteById(int id){
        return estudanteRepository.findById(id).orElse(null);
    }
    public Estudante updateEstudanteById(Estudante estudante) {
        Optional<Estudante> estudanteFound = estudanteRepository.findById(estudante.getIdstudents());

        if(estudanteFound.isPresent()){
            Estudante estudanteupdate = estudanteFound.get();
            estudanteupdate.setName(estudante.getName());
            estudanteupdate.setAge(estudante.getAge());
            estudanteupdate.setCpf(estudante.getCpf());
            estudanteupdate.setEmail(estudante.getEmail());
            return estudanteRepository.save(estudante);
        }else{
            return null;
        }
    }
    public String deleteEstudanteById(int id) {
        estudanteRepository.deleteById(id);
        return "Estudante"+ id +" deleted";
    }



}

