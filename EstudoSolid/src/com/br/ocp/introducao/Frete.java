package com.br.ocp.introducao;

public class Frete {

	public double para(String cidade) {
		if ("São Paulo".equals(cidade)) {
			return 15;
		}
		
		return 30;
	}
	
}
