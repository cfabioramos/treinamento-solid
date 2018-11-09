package com.br.ocp.passo1;

public class Frete implements ServicoDeEntrega {

	public double para(String cidade) {
		if ("São Paulo".equals(cidade)) {
			return 15;
		}
		
		return 30;
	}
	
}
