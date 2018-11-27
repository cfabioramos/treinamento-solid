package com.br.isp.exercicio;

public class EconomicPrinter implements ISmartDevice {

	@Override
	public void Print() {
		// TODO Auto-generated method stub
	}

	@Override
	public void Fax() {
		throw new NotSupportedException();
	}

	@Override
	public void Scan() {
		throw new NotSupportedException();
		
	}

}
