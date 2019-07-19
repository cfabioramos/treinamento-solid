package com.br.ocp.introducao;

public class CalculadoraDePrecos {

	public double calcula(Compra compra) {

		Double desconto = null;

		if ("São Paulo".equals(compra.getCidade()))
			desconto = new TabelaDePrecoPadrao().descontoPara(compra.getValor());
		else if ("Rio de Janeiro".equals(compra.getCidade()))
			desconto = new TabelaDePrecosReduzida().descontoPara(compra.getValor());

		Frete correios = new Frete();
		double frete = correios.para(compra.getCidade());
		
		return compra.getValor() * (1 - desconto) + frete;
	}
	
	
}
