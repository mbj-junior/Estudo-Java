public class AutenticacaoUtil {

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha){
            System.out.println("senha valida");
            return true;
        } else {
            System.out.println("senha invalida");
            return false;
        }
    }

}
