package com.br.srp.exercicio.solucaoSugerida;

public class NotaFiscal {

	private double valor;
	private double imposto;

	public NotaFiscal(Fatura fatura) {
		this.setValor(fatura.getValorMensal());
		this.setImposto(this.impostoSimplesSobre(this.valor));
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	private double impostoSimplesSobre(double valor) {
        return valor * 0.06;
    }
	
}
