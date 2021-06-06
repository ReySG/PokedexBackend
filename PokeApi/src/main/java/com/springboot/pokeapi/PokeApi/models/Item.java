package com.springboot.pokeapi.PokeApi.models;

public class Item {

	private int id;
	private int cost;
	private int fling_power;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getFling_power() {
		return fling_power;
	}

	public void setFling_power(int fling_power) {
		this.fling_power = fling_power;
	}

}
