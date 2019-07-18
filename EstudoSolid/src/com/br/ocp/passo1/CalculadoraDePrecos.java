package com.br.ocp.passo1;

public class CalculadoraDePrecos {
	
	private TabelaDePreco tabela;
	private ServicoDeEntrega entrega;
	
	public CalculadoraDePrecos(TabelaDePreco tabela, ServicoDeEntrega entrega) {
		this.tabela = tabela;
		this.entrega = entrega;
	}
	
	public double calcula(Compra compra) {
		
		double desconto = this.tabela.descontoPara(compra.getValor());
		double frete = this.entrega.para(compra.getCidade());
		
		return compra.getValor() * (1 - desconto) + frete;
		
	}
	
	
}
