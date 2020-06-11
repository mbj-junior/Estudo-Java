public class Gerente extends FuncionarioAutenticavel {


    public double getBonificacao(){
        System.out.println("bonificacao do Gerente");
        return super.getSalario();
    }

}
