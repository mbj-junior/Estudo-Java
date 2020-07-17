package br.com.alura.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProdutoTest {
	
	@Test
	public void verificaPrecoComImposto() {
		Produto caneta = new Produto("Caneta Azul", 1.10);
		assertEquals(1.21,caneta.getPrecoComImposto(), 0.00001);
	}

}
