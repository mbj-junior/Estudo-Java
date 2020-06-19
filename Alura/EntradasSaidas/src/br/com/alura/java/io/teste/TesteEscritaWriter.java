package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaWriter {
    public static void main(String[] args) throws IOException {

        //Fluxo de saida com arquivo

        OutputStream fos = new FileOutputStream("saida.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("1234567890");
        bw.newLine();
        bw.newLine();
        bw.write("1234567890");


        bw.close();


    }
}
