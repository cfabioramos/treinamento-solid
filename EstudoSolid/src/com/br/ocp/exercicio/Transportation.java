package com.br.ocp.exercicio;

public class Transportation {

    public static void main(String[] args) {
        float distance = 100;
        String transportType = "CAR";
        float transportSpeed = 0;

        if ("CAR".equals(transportType)) {
            transportSpeed = 50;
            System.out.println("You will arrive at your destination in: "
                    + (distance / transportSpeed) * 60 + " minutes");
        } else if ("BUS".equals(transportType)) {
            transportSpeed = 40;
            System.out.println("You will arrive at your destination in: "
                    + (distance / transportSpeed) * 60 + " minutes");
        } else if ("BICYCLE".equals(transportType)) {
            transportSpeed = 25;
            System.out.println("You will arrive at your destination in: "
                    + (distance / transportSpeed) * 60 + " minutes");
        }
    }

}
