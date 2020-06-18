package br.com.bytebank.banco.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {

        //Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();
        ArrayList<String> nomes = new ArrayList<String>();

        Conta cc1 = new ContaCorrente(11,11);
        lista.add(cc1);
        Conta cc2 = new ContaCorrente(22,22);
        lista.add(cc2);
        Conta cc3 = new ContaCorrente(33,33);
        lista.add(cc3);
        Conta cc4 = new ContaCorrente(44,44);
        lista.add(cc4);

        System.out.println(lista.size());
        System.out.println(lista.get(0));
        Conta ref = (Conta) lista.get(0);
        System.out.println(ref.getNumero());

        for (int i = 0; i < lista.size(); i++) {
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("*******************");
        //Depois do 1.5
        for (Object oRef : lista){
            System.out.println(oRef);
        }

    }
}
