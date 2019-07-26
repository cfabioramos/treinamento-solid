package com.br.ocp.strategy.passo1;

public class ImpostoSaoPaulo implements ImpostoStrategy{

    @Override
    public Double calcula(NotaFiscal notaFiscal) {
        return notaFiscal.getValor() * 0.06;
    }

}
