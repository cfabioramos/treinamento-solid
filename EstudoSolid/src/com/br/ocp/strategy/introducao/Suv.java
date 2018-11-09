package com.br.ocp.strategy.introducao;

public class Suv extends Carro {

	public Suv() {
		super("SUV");
	}
	
	@Override
	public Boolean frear() {
		System.out.println("Brake with ABS applied");
		return true;
	}

}
