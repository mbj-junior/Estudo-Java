package br.com.alura.maven;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		Produto produto = new Produto("Caneta Azul", 1.10);
		
		System.out.println(produto.getNome()+", Azul caeta, custa " +produto.getPreco() );
	}
}
