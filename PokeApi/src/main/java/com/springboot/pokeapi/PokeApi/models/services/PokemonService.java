package com.springboot.pokeapi.PokeApi.models.services;

import com.springboot.pokeapi.PokeApi.models.Pokemon;
import com.springboot.pokeapi.PokeApi.models.PokemonSpecies;
import com.springboot.pokeapi.PokeApi.models.ResourceApi;

public interface PokemonService {

	public ResourceApi getPokemon();

	public Pokemon getPokemonData(String name);

	public Pokemon getData(String name);

	public PokemonSpecies getSpecie(String name);

}
