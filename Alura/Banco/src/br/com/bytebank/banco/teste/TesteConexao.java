package br.com.bytebank.banco.teste;


import br.com.bytebank.banco.modelo.Conexao;

public class TesteConexao{
    public static void main(String[] args) throws Exception {

        try (Conexao conexao = new Conexao()){
            conexao.leDados();
        }catch (IllegalStateException ex){
            System.out.println("Error: ");
        }

        /*
        Conexao con = null;
        try {
            con = new Conexao();
            con.leDados();
        }catch (IllegalStateException ex){
            System.out.println("Error na conexão");
        }finally {
            if (con != null){
                 con.close();
            }

        }*/
    }
}
