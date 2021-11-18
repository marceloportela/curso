package com.m4u.curso.services;
import com.m4u.curso.model.Endereco;
import com.m4u.curso.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class EnderecoServices {
    @Autowired
    private EnderecoRepository enderecoRepository;

    public Endereco createEndereco(Endereco endereco){
        return enderecoRepository.save(endereco);
    }
    public List<Endereco> getEnderecoList() {

        return enderecoRepository.findAll();
    }
    public Endereco getEnderecoById(int id) {

        return enderecoRepository.findById(id).orElse(null);
    }
    public Endereco updateEnderecoById(Endereco endereco) {
        Optional<Endereco> enderecoFound = enderecoRepository.findById(endereco.getIdAdress());
        if (enderecoFound.isPresent()) {
            Endereco enderecoUpdate = enderecoFound.get();
            enderecoUpdate.setStreet(endereco.getStreet());
            enderecoUpdate.setCity(endereco.getCity());
            enderecoUpdate.setState(endereco.getState());
            enderecoUpdate.setZipcode(endereco.getZipcode());
            enderecoUpdate.setCountry(endereco.getCountry());

            return enderecoRepository.save(endereco);
        } else {
            return null;
        }

    }
    public String deleteEnderecoById(int id) {
        enderecoRepository.deleteById(id);
        return "User "+ id +" deleted";
    }
    }
