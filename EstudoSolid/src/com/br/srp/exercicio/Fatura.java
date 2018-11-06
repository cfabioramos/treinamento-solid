package com.br.srp.exercicio;

public class Fatura {
	
	public Fatura(double valor) {
		this.valorMensal = valor;
	}
	
	private double valorMensal;

	public double getValorMensal() {
		return valorMensal;
	}

	public void setValorMensal(double valorMensal) {
		this.valorMensal = valorMensal;
	}
	
}
