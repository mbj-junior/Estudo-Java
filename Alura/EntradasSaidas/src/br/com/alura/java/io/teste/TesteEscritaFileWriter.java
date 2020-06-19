package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {

        //Fluxo de saida com arquivo

        FileWriter fw = new FileWriter("entrada2.txt");

        fw.write("1234567890");
        fw.write(System.lineSeparator());
        fw.write(System.lineSeparator());
        fw.write("1234567890");

        fw.close();


    }
}
