package com.br.isp.introducao;

public interface ByteUtils {

	int read(byte[] b); // Read into buffer
	int write(byte[] b); // Write into buffer
	int trim(byte[] b, String exclusions); // Trim buffer by removing bytes from the exclusion chars
	
}
