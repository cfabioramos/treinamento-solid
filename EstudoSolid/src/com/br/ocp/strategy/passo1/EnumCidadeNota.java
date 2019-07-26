package com.br.ocp.strategy.passo1;

public enum EnumCidadeNota {

    SAO_PAULO (new ImpostoSaoPaulo()),
    RIO_DE_JANEIRO (new ImpostoRio());

    EnumCidadeNota(ImpostoStrategy impostoStrategy) {
        this.impostoStrategy = impostoStrategy;
    }

    private ImpostoStrategy impostoStrategy;

    public ImpostoStrategy getImpostoStrategy() {
        return impostoStrategy;
    }
}
