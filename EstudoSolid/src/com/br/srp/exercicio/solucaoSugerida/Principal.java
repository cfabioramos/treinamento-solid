package com.br.srp.exercicio.solucaoSugerida;

public class Principal {

	public static void main(String[] args) {
    	GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal(
    			new EnviadorDeEmail(), new NotaFiscalDao());
    	
    	NotaFiscal nf = gerador.gera(new Fatura(24.00));
    	
    	System.out.println(nf.getImposto());
	}
	
}
