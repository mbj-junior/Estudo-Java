package br.com.alura.java.io.teste;

import java.io.*;

public class TesteCopiarArquivo {
    public static void main(String[] args) throws IOException {

        //Fluxo de entrada e saida com arquivo
        InputStream fis = new FileInputStream("entrada.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = new FileOutputStream("saida.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();

        while (linha != null){
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }

        br.close();
        bw.close();


    }
}
