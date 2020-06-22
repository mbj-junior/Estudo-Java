package br.com.alura.java.io.teste;

import java.io.*;

public class TesteSerialização {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String nomeOut = "Junior";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.bin"));
        oos.writeObject(nomeOut);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.bin"));
        String nomeIn =(String) ois.readObject();
        ois.close();
        System.out.println(nomeIn);

    }
}
