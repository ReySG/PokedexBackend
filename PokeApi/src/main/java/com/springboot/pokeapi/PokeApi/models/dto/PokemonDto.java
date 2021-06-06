package com.springboot.pokeapi.PokeApi.models.dto;

import java.util.ArrayList;

import com.springboot.pokeapi.PokeApi.models.FlavorText;
import com.springboot.pokeapi.PokeApi.models.PokemonAbility;
import com.springboot.pokeapi.PokeApi.models.PokemonSpecies;
import com.springboot.pokeapi.PokeApi.models.PokemonSprites;
import com.springboot.pokeapi.PokeApi.models.PokemonType;

public class PokemonDto {

	private int id;
	private String name;
	private int weight;
	private PokemonSprites sprites;
	private ArrayList<PokemonType> types;
	private ArrayList<PokemonAbility> abilities;
	private PokemonSpecies species;
	private ArrayList<FlavorText> flavor_text_entries;


	public PokemonSpecies getSpecies() {
		return species;
	}

	public void setSpecies(PokemonSpecies species) {
		this.species = species;
	}

	public ArrayList<PokemonAbility> getAbilities() {
		return abilities;
	}

	public void setAbilities(ArrayList<PokemonAbility> abilities) {
		this.abilities = abilities;
	}

	public ArrayList<FlavorText> getFlavor_text_entries() {
		return flavor_text_entries;
	}

	public void setFlavor_text_entries(ArrayList<FlavorText> flavor_text_entries) {
		this.flavor_text_entries = flavor_text_entries;
	}

	public PokemonSprites getSprites() {
		return sprites;
	}

	public void setSprites(PokemonSprites sprites) {
		this.sprites = sprites;
	}

	public ArrayList<PokemonType> getTypes() {
		return types;
	}

	public void setTypes(ArrayList<PokemonType> types) {
		this.types = types;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
