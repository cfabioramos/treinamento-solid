package com.br.lsp.exercicio;

public class RotatingStore extends BasicStore {
	
	public void makeMoreRoomForStore() {

	    this.stash.remove(this.stash.size() - 1);
    }
}
