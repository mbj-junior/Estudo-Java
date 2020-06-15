package defaultpk;

public class testaContaComExcecaoChecked {

    public static void main(String[] args) {

        Conta c = new Conta();
        try{
           c.deposita();
        }catch (MinhaExcecao ex){
            System.out.println("tratamento ..");
        }

    }
}
