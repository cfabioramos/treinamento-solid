package com.br.srp.exercicio.solucaoSugerida;

import java.util.List;

public class GeradorDeNotaFiscal {

	private List<AcaoPosGeracaoNota> acoesPos;

    public GeradorDeNotaFiscal(List<AcaoPosGeracaoNota> acoesPos) {
        this.acoesPos = acoesPos;
    }

    public NotaFiscal gera(Fatura fatura) {

        NotaFiscal nf = new NotaFiscal(fatura);
        
        for (AcaoPosGeracaoNota acaoPosGeracaoNota : acoesPos) {
        	acaoPosGeracaoNota.executa(nf);
		}

        return nf;
    }

}
