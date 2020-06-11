public class Gerente extends Funcionario {


    public double getBonificacao(){
        System.out.println("bonificacao do Gerente");
        return super.getSalario();
    }

}
