package com.springboot.pokeapi.PokeApi.models;

public class EvolutionDetail {

	private int gender;

	private Type known_move_type;

	private int min_level;

	private int min_happiness;

	private int min_beauty;

	private int min_affection;

	private boolean needs_overworld_rain;

	private PokemonSpecies party_species;

	private Type party_type;

	private int relative_physical_stats;

	private String time_of_day;

	private PokemonSpecies trade_species;

	private boolean turn_upside_down;

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public Type getKnown_move_type() {
		return known_move_type;
	}

	public void setKnown_move_type(Type known_move_type) {
		this.known_move_type = known_move_type;
	}

	public int getMin_level() {
		return min_level;
	}

	public void setMin_level(int min_level) {
		this.min_level = min_level;
	}

	public int getMin_happiness() {
		return min_happiness;
	}

	public void setMin_happiness(int min_happiness) {
		this.min_happiness = min_happiness;
	}

	public int getMin_beauty() {
		return min_beauty;
	}

	public void setMin_beauty(int min_beauty) {
		this.min_beauty = min_beauty;
	}

	public int getMin_affection() {
		return min_affection;
	}

	public void setMin_affection(int min_affection) {
		this.min_affection = min_affection;
	}

	public boolean isNeeds_overworld_rain() {
		return needs_overworld_rain;
	}

	public void setNeeds_overworld_rain(boolean needs_overworld_rain) {
		this.needs_overworld_rain = needs_overworld_rain;
	}

	public PokemonSpecies getParty_species() {
		return party_species;
	}

	public void setParty_species(PokemonSpecies party_species) {
		this.party_species = party_species;
	}

	public Type getParty_type() {
		return party_type;
	}

	public void setParty_type(Type party_type) {
		this.party_type = party_type;
	}

	public int getRelative_physical_stats() {
		return relative_physical_stats;
	}

	public void setRelative_physical_stats(int relative_physical_stats) {
		this.relative_physical_stats = relative_physical_stats;
	}

	public String getTime_of_day() {
		return time_of_day;
	}

	public void setTime_of_day(String time_of_day) {
		this.time_of_day = time_of_day;
	}

	public PokemonSpecies getTrade_species() {
		return trade_species;
	}

	public void setTrade_species(PokemonSpecies trade_species) {
		this.trade_species = trade_species;
	}

	public boolean isTurn_upside_down() {
		return turn_upside_down;
	}

	public void setTurn_upside_down(boolean turn_upside_down) {
		this.turn_upside_down = turn_upside_down;
	}
	
	
}
