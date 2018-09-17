package com.example.pokemon.controller;

import com.example.pokemon.model.PokemonDetalhe;
import com.example.pokemon.repository.PokemonDetalheRepository;
import com.example.pokemon.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("detalhes")
public class PokemonDetalhesController {

    @Autowired
    private PokemonDetalheRepository pokemonDetalheRepository;

    @Autowired
    private PokemonService pokemonService;

    @GetMapping
    public ResponseEntity<?> pokemonDetalheListar(){

        return new ResponseEntity<>(pokemonDetalheRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> pokemonDetalheListarId(@PathVariable("id") Long id){
        pokemonService.verifyPokemonExistente(id);
        PokemonDetalhe pokemonDetalhe = pokemonDetalheRepository.findOne(id);
        return new ResponseEntity<>(pokemonDetalhe, HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<?> pokemonDetalheSalvar(@RequestBody PokemonDetalhe pokemonDetalhe){
        return new ResponseEntity<>(pokemonDetalheRepository.save(pokemonDetalhe), HttpStatus.OK);
    }
}
