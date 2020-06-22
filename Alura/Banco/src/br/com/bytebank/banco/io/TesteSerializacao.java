package br.com.bytebank.banco.io;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException {
        Cliente clienteOut = new Cliente();
        clienteOut.setNome("Junior");
        clienteOut.setProfissao("Estudante");
        clienteOut.setCpf("123123123");

        ContaCorrente cc = new ContaCorrente(1111,1111);
        cc.deposita(222.4);
        cc.setTitular(clienteOut);

        //Serialização
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc);
        oos.close();

    }
}
