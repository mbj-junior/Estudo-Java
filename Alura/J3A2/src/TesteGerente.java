public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setName("marcio");
        g1.setCpf("123131322");
        g1.setSalario(9000);

        boolean autenticou = g1.autentica(1111);

        System.out.println(g1.getName()+g1.getSalario()+g1.getCpf());
        System.out.println(autenticou);

        System.out.println(g1.getBonificacao());
    }
}
