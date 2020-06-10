public class testeReferencias {
    public static void main(String[] args) {

        Funcionario g1 = new Gerente();

        g1.setName("Marcios");
        String nome = g1.getName();

        System.out.println(nome);
    }
}
