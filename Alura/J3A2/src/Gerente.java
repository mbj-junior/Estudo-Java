public class Gerente extends Funcionario implements Autenticavel{

    private int senha;

    public double getBonificacao(){
        System.out.println("bonificacao do Gerente");
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
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
