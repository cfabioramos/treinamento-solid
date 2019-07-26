package com.br.srp.passo1;

import com.br.srp.introducao.Funcionario;

public class DezOuVintePorCento {

	public double calcula(Funcionario funcionario) {
		if(funcionario.getSalarioBase() > 3000.0) {
            return funcionario.getSalarioBase() * 0.8;
        }
        else {
            return funcionario.getSalarioBase() * 0.9;
        }
	}

}
