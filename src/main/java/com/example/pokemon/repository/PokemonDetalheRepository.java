package com.example.pokemon.repository;

import com.example.pokemon.model.PokemonDetalhe;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PokemonDetalheRepository extends PagingAndSortingRepository<PokemonDetalhe, Long> {

}
