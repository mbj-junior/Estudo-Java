public class SistemaInterno {

    private int senha = 3333;

    public void autentica (Autenticavel fa){

        boolean autenticou = fa.autentica(senha);
        if (autenticou){
            System.out.println("Acesso Aceito");
        } else {
            System.out.println("Acesso Negado");
        }
    }

}
