package com.br.ocp.strategy.passo1;

public class CarExample {

	public static void main(final String[] arguments) {
        Car sedanCar = new Sedan();
        sedanCar.applyBrake();

        Car suvCar = new SUV();
        suvCar.applyBrake();

        suvCar.setBrakeBehavior( new Brake() );
        suvCar.applyBrake();
    }
	
}
