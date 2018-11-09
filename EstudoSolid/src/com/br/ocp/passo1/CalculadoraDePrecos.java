package com.br.ocp.passo1;

public class CalculadoraDePrecos {
	
	private TabelaDePreco tabela;
	private ServicoDeEntrega entrega;
	
	public CalculadoraDePrecos(TabelaDePreco tabela, ServicoDeEntrega entrega) {
		this.tabela = tabela;
		this.entrega = entrega;
	}
	
	public double calcula(Compra produto) {
		
		double desconto = this.tabela.descontoPara(produto.getValor());
		double frete = this.entrega.para(produto.getCidade());
		
		return produto.getValor() * (1 - desconto) + frete;
		
	}
	
	
}
