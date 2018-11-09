package com.br.ocp.strategy.introducao;

public class Sedan extends Carro {

	public Sedan() {
		super("Sedan");
	}

	@Override
	public Boolean frear() {
		System.out.println("Simple Brake applied");
		return true;
	}

}
