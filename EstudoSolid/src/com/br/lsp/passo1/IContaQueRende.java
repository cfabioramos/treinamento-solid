package com.br.lsp.passo1;

public interface IContaQueRende {

	default void rende() {
		getSaldo();
	}
	
	double getSaldo();
	
}
