package com.springboot.pokeapi.PokeApi.models;

import java.util.ArrayList;

public class ResourceApi {
	private int count;
	private String next;
	private boolean previous;
	
	private ArrayList<Results> results;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public boolean isPrevious() {
		return previous;
	}

	public void setPrevious(boolean previous) {
		this.previous = previous;
	}

	public ArrayList<Results> getResults() {
		return results;
	}

	public void setResults(ArrayList<Results> results) {
		this.results = results;
	}


	
	

}
