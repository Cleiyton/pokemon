package com.example.pokemon.repository;

import com.example.pokemon.model.PokemonEvolucao;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PokemonEvolucaoRepository extends PagingAndSortingRepository<PokemonEvolucao, Long> {
}
