package com.example.pokemon.controller;

import com.example.pokemon.model.PokemonDetalhe;
import com.example.pokemon.repository.PokemonDetalheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("detalhes")
public class PokemonDetalhesController {

    @Autowired
    private PokemonDetalheRepository pokemonDetalheRepository;

    @GetMapping
    public ResponseEntity<?> pokemonDetalheListar(){

        return new ResponseEntity<>(pokemonDetalheRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> pokemonDetalheSalvar(@RequestBody PokemonDetalhe pokemonDetalhe){
        return new ResponseEntity<>(pokemonDetalheRepository.save(pokemonDetalhe), HttpStatus.OK);
    }
}
