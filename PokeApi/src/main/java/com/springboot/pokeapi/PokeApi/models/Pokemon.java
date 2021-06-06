package com.springboot.pokeapi.PokeApi.models;

import java.util.ArrayList;

public class Pokemon {

	private int id;
	
	private String name;

	private int weight;

	private PokemonSprites sprites;
	
	private ArrayList<PokemonType> types;

	private ArrayList<PokemonAbility> abilities;
	
	private PokemonSpecies species;
	
	
	public PokemonSpecies getSpecies() {
		return species;
	}

	public void setSpecies(PokemonSpecies species) {
		this.species = species;
	}

	public PokemonSprites getSprites() {
		return sprites;
	}

	public void setSprites(PokemonSprites sprites) {
		this.sprites = sprites;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public ArrayList<PokemonType> getTypes() {
		return types;
	}

	public void setTypes(ArrayList<PokemonType> types) {
		this.types = types;
	}

	public ArrayList<PokemonAbility> getAbilities() {
		return abilities;
	}

	public void setAbilities(ArrayList<PokemonAbility> abilities) {
		this.abilities = abilities;
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
