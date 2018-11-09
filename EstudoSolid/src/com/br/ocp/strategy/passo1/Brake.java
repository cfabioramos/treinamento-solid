package com.br.ocp.strategy.passo1;

public class Brake implements IBrakeBehavior {

	public void brake() {
        System.out.println("Simple Brake applied");
    }
	
}
