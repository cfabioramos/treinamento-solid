package com.br.srp.exercicio.solucaoSugerida;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List<AcaoPosGeracaoNota> acoesPos = new ArrayList<>();
		acoesPos.add(new EnviadorDeEmail());
		acoesPos.add(new NotaFiscalDao());
		
    	GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal(acoesPos);
    	
    	NotaFiscal nf = gerador.gera(new Fatura(24.00));
    	
    	System.out.println(nf.getImposto());
	}
	
}
