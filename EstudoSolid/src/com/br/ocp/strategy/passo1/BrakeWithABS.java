package com.br.ocp.strategy.passo1;

public class BrakeWithABS implements IBrakeBehavior {
	
	public void brake() {
        System.out.println("Brake with ABS applied");
    }
	
}
