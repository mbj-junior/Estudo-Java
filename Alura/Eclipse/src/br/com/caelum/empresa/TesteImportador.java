package br.com.caelum.empresa;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.Collection;

import br.com.caelum.empresa.modelo.Gasto;

public class TesteImportador {

	public static void main(String[] args) throws UnsupportedEncodingException, ParseException {

		String conteudo = "CARTAO01012011000010000124Jose da Silva					25012970\r\n"
				+ "CARTAO01012011000010000124Jose da Silva					25012970\r\n"
				+ "CARTAO01012011000010000124Jose da Silva					25012970\r\n";

		Importador importador = new Importador();

		Collection<Gasto> list = importador.importa(new ByteArrayInputStream(conteudo.getBytes("UTF-8")));

		for (Gasto gasto : list) {
			System.out.println(gasto);
		}

	}

}
