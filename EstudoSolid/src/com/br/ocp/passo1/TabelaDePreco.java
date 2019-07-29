package com.br.ocp.passo1;

public interface TabelaDePreco {

	// Implementação para o desconto padrão.
	default double descontoPara(double valor) {
		return valor;
	}
	
}
