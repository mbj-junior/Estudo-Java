public class Gerente extends Funcionario {

    private int senha = 1111;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        } else {
            return  false;
        }
    }

    public double getBonificacao(){
        System.out.println("bonificacao do Gerente");
        return super.getSalario();
    }

}
