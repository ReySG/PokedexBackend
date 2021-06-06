package com.springboot.pokeapi.PokeApi.models;

import java.util.ArrayList;

public class PokemonSpecies {

	private int id;

	private String name;

	private int gender_rate;

	private EvolutionChain evolution_chain;
	
	private PokemonSpecies evolves_from_species;
	
	private ArrayList<FlavorText> flavor_text_entries;
	
	
	

	

	public PokemonSpecies getEvolves_from_species() {
		return evolves_from_species;
	}

	public void setEvolves_from_species(PokemonSpecies evolves_from_species) {
		this.evolves_from_species = evolves_from_species;
	}

	public ArrayList<FlavorText> getFlavor_text_entries() {
		return flavor_text_entries;
	}

	public void setFlavor_text_entries(ArrayList<FlavorText> flavor_text_entries) {
		this.flavor_text_entries = flavor_text_entries;
	}

	public EvolutionChain getEvolution_chain() {
		return evolution_chain;
	}

	public void setEvolution_chain(EvolutionChain evolution_chain) {
		this.evolution_chain = evolution_chain;
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

	public int getGender_rate() {
		return gender_rate;
	}

	public void setGender_rate(int gender_rate) {
		this.gender_rate = gender_rate;
	}

}
