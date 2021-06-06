package com.springboot.pokeapi.PokeApi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.pokeapi.PokeApi.models.Pokemon;
import com.springboot.pokeapi.PokeApi.models.PokemonSpecies;
import com.springboot.pokeapi.PokeApi.models.ResourceApi;
import com.springboot.pokeapi.PokeApi.models.dto.PokemonDto;
import com.springboot.pokeapi.PokeApi.models.services.PokemonService;

@CrossOrigin(origins = { "http://localhost:4200", "*" })
@RestController
@RequestMapping("/api")
public class PokeApiController {

	@Autowired
	private PokemonService pokemonService;

	// Obtiene lista de pokemons y los almacena en caché
	// para que la siguiente vez que se refresque la pagina cargen mas rapido

	@GetMapping("/obtener-pokemon")
	@Cacheable({ "pokemon" })
	public ResourceApi getPokemon() {
		return pokemonService.getPokemon();

	}

	// Obtiene diferentes datos del pokemon mediante un DTO
	// Almacena en caché el pokemon buscado
	@GetMapping("/obtener-data/{id}")
	@Cacheable({ "pokemon" })
	public PokemonDto getInfoById(@PathVariable String id) {

		Pokemon pokemon = pokemonService.getData(id);
		PokemonSpecies especie = pokemonService.getSpecie(id);

		PokemonDto info = new PokemonDto();

		info.setId(pokemon.getId());
		info.setName(pokemon.getName());
		info.setWeight(pokemon.getWeight());
		info.setSprites(pokemon.getSprites());
		info.setTypes(pokemon.getTypes());
		info.setAbilities(pokemon.getAbilities());
		info.setSpecies(pokemon.getSpecies());
		info.setFlavor_text_entries(especie.getFlavor_text_entries());

		return info;

	}

}
