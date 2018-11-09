package com.br.ocp.strategy.passo1;

public class Sedan extends Car {

	public Sedan() {
        this.brakeBehavior = new Brake();
    }
	
}
