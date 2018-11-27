package com.br.isp.exercicio;

public interface ISmartDevice {
	
	void Print();
	
    default void Fax() {
    	
    }
    
    void Scan();
	
}
