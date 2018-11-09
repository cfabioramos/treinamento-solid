package com.br.ocp.strategy.passo1;

public class SUV extends Car {

	public SUV() {
        this.brakeBehavior = new BrakeWithABS();
    }
	
}
