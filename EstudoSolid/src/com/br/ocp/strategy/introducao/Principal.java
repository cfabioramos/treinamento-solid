package com.br.ocp.strategy.introducao;

public class Principal {

	public static void main(String[] args) {
		
		Carro carro1 = new Sedan();
		carro1.frear();
		
		Carro carro2 = new Suv();
		carro2.frear();

	}

}
