package com.br.lsp.passo1;

public class ContaComum implements IContaQueRende {

	private final double TAXA_RENDIMENTO = 0.02;

	private ManipuladorDeSaldo manipulador;

	public ContaComum(double saldo) {
		this.manipulador = new ManipuladorDeSaldo(saldo);
	}
	
	public void rende()  {
		this.manipulador.rende(TAXA_RENDIMENTO);
    }
	
	public void saca(double valor, boolean isCaixaEletronico)  {
		if (isCaixaEletronico)
			manipulador.saca(valor - 0.25);	
		else
			manipulador.saca(valor);
    }
	
	public double getSaldo()  {
        return manipulador.getSaldo();
    }
	
	public void deposita(double valor)  {
        manipulador.deposita(valor);
    }

}
