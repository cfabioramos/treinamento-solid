package com.br.srp.passo1;

import com.br.srp.introducao.Funcionario;

public class QuinzeOuVinteECincoPorCento {

	@Override
	public double calcula(Funcionario funcionario) {
		if(funcionario.getSalarioBase() > 2000.0) {
            return funcionario.getSalarioBase() * 0.75;
        }
        else {
            return funcionario.getSalarioBase() * 0.85;
        }
	}
	
}
