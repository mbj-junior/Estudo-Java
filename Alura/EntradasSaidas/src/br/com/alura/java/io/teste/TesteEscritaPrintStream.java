package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStream {
    public static void main(String[] args) throws IOException {

        //Fluxo de saida com arquivo
        PrintStream ps = new PrintStream("entrada2.txt");

        ps.println("PrintStream");
        ps.println();
        ps.println("****");

        ps.close();


        PrintWriter pw = new PrintWriter("entrada2.txt");
        pw.println("PrintWriter");
        pw.println();
        pw.println("****");

        pw.close();

    }
}
