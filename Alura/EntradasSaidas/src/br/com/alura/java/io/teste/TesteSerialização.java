package br.com.alura.java.io.teste;

import java.io.*;

public class TesteSerialização {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //String nomeOut = "Junior";

        Cliente clienteOut = new Cliente();
        clienteOut.setNome("Junior");
        clienteOut.setProfissao("Estudante");
        clienteOut.setCpf("123123123");

        //Serialização
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        oos.writeObject(clienteOut);
        oos.close();

        //Deserialização
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente clienteIn =(Cliente) ois.readObject();
        ois.close();
        System.out.println(clienteIn.getNome());

    }
}
