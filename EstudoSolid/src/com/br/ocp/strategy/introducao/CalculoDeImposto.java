package com.br.ocp.strategy.introducao;

public class CalculoDeImposto {

    public Double calcula(NotaFiscal notaFiscal) {

        if ("São Paulo".equals(notaFiscal.getCidade())) {
            return notaFiscal.getValor() * 0.07;
        }
        else if ("Rio de Janeiro".equals(notaFiscal.getCidade())) {
            return notaFiscal.getValor() * 0.06;
        }
        else {
            return calculoPadrao(notaFiscal.getValor());
        }

    }

    private Double calculoPadrao(Double valor) {
        return valor * 0.05;
    }

}
