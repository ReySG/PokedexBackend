package com.springboot.pokeapi.PokeApi.models;

import java.util.ArrayList;

public class ChainLink {

	

	
	
	private boolean is_baby;
	
	private ArrayList<EvolutionDetail> evolution_details;
	
	private ArrayList<ChainLink> evolves_to;
	private PokemonSpecies species;
	
	public boolean isIs_baby() {
		return is_baby;
	}

	public void setIs_baby(boolean is_baby) {
		this.is_baby = is_baby;
	}

	public ArrayList<EvolutionDetail> getEvolution_details() {
		return evolution_details;
	}

	public void setEvolution_details(ArrayList<EvolutionDetail> evolution_details) {
		this.evolution_details = evolution_details;
	}

	public ArrayList<ChainLink> getEvolves_to() {
		return evolves_to;
	}

	public void setEvolves_to(ArrayList<ChainLink> evolves_to) {
		this.evolves_to = evolves_to;
	}

	public PokemonSpecies getSpecies() {
		return species;
	}

	public void setSpecies(PokemonSpecies species) {
		this.species = species;
	}

//	public ArrayList<EvolutionDetail> getEvolution_details() {
//		return evolution_details;
//	}
//
//	public void setEvolution_details(ArrayList<EvolutionDetail> evolution_details) {
//		this.evolution_details = evolution_details;
//	}

}
