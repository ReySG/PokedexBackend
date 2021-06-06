package com.springboot.pokeapi.PokeApi.models.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.HttpComponentsAsyncClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springboot.pokeapi.PokeApi.models.Pokemon;
import com.springboot.pokeapi.PokeApi.models.PokemonSpecies;
import com.springboot.pokeapi.PokeApi.models.ResourceApi;
import com.springboot.pokeapi.PokeApi.models.services.PokemonService;

@Service
public class PokemonServicesImpl implements PokemonService {

	private static String pokeApiUrl = "https://pokeapi.co/api/v2/pokemon/";

	private static String descUrl = "https://pokeapi.co/api/v2/pokemon-species/";

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public ResourceApi getPokemon() {
		restTemplate.setRequestFactory(new HttpComponentsAsyncClientHttpRequestFactory());
		ResourceApi pokemon = restTemplate.getForObject(pokeApiUrl, ResourceApi.class);
		return pokemon;
	}

	@Override
	public Pokemon getPokemonData(String name) {
		restTemplate.setRequestFactory(new HttpComponentsAsyncClientHttpRequestFactory());
		Pokemon pokemonData = restTemplate.getForObject(pokeApiUrl + name, Pokemon.class);
		return pokemonData;
	}

	@Override
	public Pokemon getData(String id) {
		restTemplate.setRequestFactory(new HttpComponentsAsyncClientHttpRequestFactory());
		Pokemon pokemonData = restTemplate.getForObject(pokeApiUrl + id, Pokemon.class);
		return pokemonData;
	}

	@Override
	public PokemonSpecies getSpecie(String name) {
		restTemplate.setRequestFactory(new HttpComponentsAsyncClientHttpRequestFactory());
		PokemonSpecies species = restTemplate.getForObject(descUrl + name, PokemonSpecies.class);
		return species;
	}

}
