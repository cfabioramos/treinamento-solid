package com.br.lsp.passo1;

public class ContaDeEstudante implements IContaQueRende {
	
	private ManipuladorDeSaldo manipulador;
	private int milhas;
	
	public ContaDeEstudante(double saldo) {
        this.manipulador = new ManipuladorDeSaldo(saldo);
    }

	public void deposita(double valor)  {
        manipulador.deposita(valor);
        this.milhas += (int)valor;
    }
	
	public double getSaldo()  {
        return manipulador.getSaldo();
    }
	
	public int getMilhas()  {
        return milhas;
    }

}
