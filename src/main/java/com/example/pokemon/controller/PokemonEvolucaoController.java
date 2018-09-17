package com.example.pokemon.controller;

import com.example.pokemon.model.PokemonEvolucao;
import com.example.pokemon.repository.PokemonEvolucaoRepository;
import com.example.pokemon.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Evolucao")
public class PokemonEvolucaoController {

    @Autowired
    private PokemonEvolucaoRepository pokemonEvolucaoRepository;

    @Autowired
    private PokemonService pokemonService;

    @GetMapping
    public ResponseEntity<?> pokemonEvolucaoListar(){
        return new ResponseEntity<>(pokemonEvolucaoRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?>pokemonEolucaoId(@PathVariable("id") Long id){

        pokemonService.verifyPokemonExistente(id);

        PokemonEvolucao pokemonEvolucao = pokemonEvolucaoRepository.findOne(id);
        return new ResponseEntity<>(pokemonEvolucao, HttpStatus.OK);

    }


    @PostMapping
    public ResponseEntity<?> pokemonEvolucaoSalvar(@RequestBody PokemonEvolucao pokemonEvolucao){

        return new ResponseEntity<>(pokemonEvolucaoRepository.save(pokemonEvolucao),HttpStatus.OK);
    }





}
