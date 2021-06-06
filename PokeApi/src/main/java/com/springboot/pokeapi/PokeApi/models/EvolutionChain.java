package com.springboot.pokeapi.PokeApi.models;

public class EvolutionChain  {

	private int id;
	
	private Item baby_trigger_item;
	
	private ChainLink chain;

	

	public Item getBaby_trigger_item() {
		return baby_trigger_item;
	}

	public void setBaby_trigger_item(Item baby_trigger_item) {
		this.baby_trigger_item = baby_trigger_item;
	}

	public ChainLink getChain() {
		return chain;
	}

	public void setChain(ChainLink chain) {
		this.chain = chain;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
//	private static EvolutionChain get(String url) {
//		EvolutionChain obj = new com.google.gson.Gson().fromJson(Information.fromInternet(url), EvolutionChain.class);
//		obj.setIsFetched(true);
//		return obj;
//	}
//
//	public EvolutionChain get() {
//		return EvolutionChain.get(this.getUrl());
//	}
//
//	public static APIResourceList getList(int limit, int offset) {
//		 return APIResourceList.getList("evolution-chain", limit, offset);
//	}

//	public static EvolutionChain getById(int id) {
//		return get("https://pokeapi.co/api/v2/evolution-chain/" + id);
//	}


}
