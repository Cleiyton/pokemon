package com.example.pokemon.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;


@Entity
public class PokemonEvolucao implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String NomeDaEvolucao;

    private Double quantidadeXp;

    private String tipoIntemParaEvoluir;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDaEvolucao() {
        return NomeDaEvolucao;
    }

    public void setNomeDaEvolucao(String nomeDaEvolucao) {
        NomeDaEvolucao = nomeDaEvolucao;
    }

    public Double getQuantidadeXp() {
        return quantidadeXp;
    }

    public void setQuantidadeXp(Double quantidadeXp) {
        this.quantidadeXp = quantidadeXp;
    }

    public String getTipoIntemParaEvoluir() {
        return tipoIntemParaEvoluir;
    }

    public void setTipoIntemParaEvoluir(String tipoIntemParaEvoluir) {
        this.tipoIntemParaEvoluir = tipoIntemParaEvoluir;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PokemonEvolucao that = (PokemonEvolucao) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
