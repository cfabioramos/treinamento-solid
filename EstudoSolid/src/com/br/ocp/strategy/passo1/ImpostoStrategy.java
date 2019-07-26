package com.br.ocp.strategy.passo1;

public interface ImpostoStrategy {

    default Double calcula(NotaFiscal notaFiscal) {
        return notaFiscal.getValor() * 0.05;
    }

}
