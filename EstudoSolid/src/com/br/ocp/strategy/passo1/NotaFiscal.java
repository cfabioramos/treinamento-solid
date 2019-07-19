package com.br.ocp.strategy.passo1;

public class NotaFiscal {

    public NotaFiscal(EnumCidadeNota enumCidade, Double valor) {
        this.cidade = enumCidade;
        this.valor = valor;
    }

    private EnumCidadeNota cidade;
    private Double valor;

    public EnumCidadeNota getCidade() {
        return cidade;
    }

    public Double getValor() {
        return valor;
    }

    public Double calculaImposto() {
        return this.cidade.getImpostoStrategy().calcula(this);
    }

}
