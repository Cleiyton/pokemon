package com.example.pokemon.repository;

import com.example.pokemon.model.Pokemon;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PokemonRepository extends PagingAndSortingRepository<Pokemon, Long> {
}
