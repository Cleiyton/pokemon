package com.example.pokemon.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class PokemonDetalhe implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String pokemonEvolucao;

    private String pokemonDetalhes;

    private Integer pokemonQtdEvolucao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPokemonEvolucao() {
        return pokemonEvolucao;
    }

    public void setPokemonEvolucao(String pokemonEvolucao) {
        this.pokemonEvolucao = pokemonEvolucao;
    }

    public String getPokemonDetalhes() {
        return pokemonDetalhes;
    }

    public void setPokemonDetalhes(String pokemonDetalhes) {
        this.pokemonDetalhes = pokemonDetalhes;
    }

    public Integer getPokemonQtdEvolucao() {
        return pokemonQtdEvolucao;
    }

    public void setPokemonQtdEvolucao(Integer pokemonQtdEvolucao) {
        this.pokemonQtdEvolucao = pokemonQtdEvolucao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PokemonDetalhe that = (PokemonDetalhe) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
