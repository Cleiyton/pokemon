package com.example.pokemon.services;

import com.example.pokemon.error.ResourceNotFoundException;
import com.example.pokemon.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;


    public void verifyPokemonExistente(Long id){
        if(pokemonRepository.findOne(id) == null){
            throw new ResourceNotFoundException("Pokemon not found for  ID:" + id);
        }
    }
}
