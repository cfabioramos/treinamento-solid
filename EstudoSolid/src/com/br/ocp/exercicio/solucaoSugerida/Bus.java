package com.br.ocp.exercicio.solucaoSugerida;

public class Bus implements Transportation {

    @Override
    public void calculateTime(float distance) {
        float transportSpeed = 40;
        System.out.println("You will arrive at your destination in: "
                + (distance / transportSpeed) * 60 + " minutes");
    }

}