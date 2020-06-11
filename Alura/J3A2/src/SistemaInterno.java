public class SistemaInterno {

    private int senha = 3333;

    public void autentica (FuncionarioAutenticavel fa){

        boolean autenticou = fa.autentica(senha);
        if (autenticou){
            System.out.println("Acesso aceito");
        } else {
            System.out.println("Acesso negado");
        }
    }

}
