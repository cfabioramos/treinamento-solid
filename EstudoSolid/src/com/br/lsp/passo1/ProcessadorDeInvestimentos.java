package com.br.lsp.passo1;

import java.util.ArrayList;
import java.util.List;

public class ProcessadorDeInvestimentos {

	public static void main(String[] args) {

        for (IContaQueRende conta : contasDoBanco()) {
            conta.rende();

            System.out.println("Novo Saldo:");
            System.out.println(conta.getSaldo());
        }
    }

	private static List<IContaQueRende> contasDoBanco() {
		List<IContaQueRende> contas = new ArrayList<>();
		contas.add(new ContaComum(100));
		contas.add(new ContaDeEstudante(40));
		contas.add(new ContaComum(124));
		contas.add(new ContaComum(332));
		return contas;
	}
	
}
