package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraScanner {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("contas.csv"));

        while (scanner.hasNextLine()){
            String linha = scanner.nextLine();
            //System.out.println(linha);

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");

            String tipoDeConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int conta = linhaScanner.nextInt();
            String nometitular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

            String valorFormatado = String.format("%s - %04d : %05d - %s $%.2f",tipoDeConta,agencia,conta,nometitular,saldo);
            System.out.println(valorFormatado);

            linhaScanner.close();

          // String[] valores = linha.split(",");
           // System.out.println(valores[3]);
        }
        scanner.close();

    }
}
