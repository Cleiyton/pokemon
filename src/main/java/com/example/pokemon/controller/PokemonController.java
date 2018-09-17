package com.example.pokemon.controller;

import com.example.pokemon.model.Pokemon;
import com.example.pokemon.repository.PokemonRepository;
import com.example.pokemon.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pokemon")
public class PokemonController {

    @Autowired
    private PokemonRepository pokemonRepository;

    @Autowired
    private PokemonService pokemonService;


    @GetMapping
    public ResponseEntity<?> pokemonListar(){

        return new ResponseEntity<>(pokemonRepository.findAll(), HttpStatus.OK);
    }


    @GetMapping(path = "/{id}")
    public ResponseEntity<?> pokemonListarid(@PathVariable("id") Long id){
        pokemonService.verifyPokemonExistente(id);
        Pokemon pokemon = pokemonRepository.findOne(id);
        return new ResponseEntity<>(pokemon, HttpStatus.OK);


    }


    @PostMapping
    public ResponseEntity<?>pokemonSalvar(@RequestBody Pokemon pokemon){
        return new ResponseEntity<>(pokemonRepository.save(pokemon), HttpStatus.OK);

    }




}
