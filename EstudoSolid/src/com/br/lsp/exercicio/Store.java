package com.br.lsp.exercicio;

import java.util.List;

public interface Store {
	
	Integer STORE_LIMIT = 5;
	
	void store(String message);
    
	List<String> retrieveMessages();
    
}
