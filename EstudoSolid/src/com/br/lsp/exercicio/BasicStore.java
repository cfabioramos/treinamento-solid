package com.br.lsp.exercicio;

import java.util.ArrayList;
import java.util.List;

public class BasicStore implements Store {

	protected List<String> stash;

	protected Integer storeLimit;

	public BasicStore() {
		this.stash = new ArrayList<>();
		this.storeLimit = STORE_LIMIT;
	}

	@Override
	public void store(String message) {
		if (this.storeLimit == this.stash.size()) {
			this.makeMoreRoomForStore();
		}
		this.stash.add(message);
	}

	private void makeMoreRoomForStore() {
		this.storeLimit += 5;
	}
	
	/**
	 * Clients using this store expect when they call this method 
	 * to get all the messages back.
	 * 
	 * How can you guarantee the side effects or invalid state transitions?
	 * 
	 */
	public List<String> retrieveMessages() {
		return this.stash;
	}
	
}
