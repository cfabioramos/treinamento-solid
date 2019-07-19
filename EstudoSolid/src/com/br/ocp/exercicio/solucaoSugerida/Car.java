package com.br.ocp.exercicio.solucaoSugerida;

public class Car implements Transportation {

    @Override
    public void calculateTime(float distance) {
        float transportSpeed = 50;
        System.out.println("You will arrive at your destination in: "
                + (distance / transportSpeed) * 60 + " minutes");
    }

}
