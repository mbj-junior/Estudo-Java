public class TesteReferencias {
    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setName("Marcio");
        g1.setSalario(5000);

        Funcionario f1 = new Funcionario();
        f1.setName("Maria");
        f1.setSalario(7000);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(f1);


        System.out.println(controle.getSoma());



    }
}
