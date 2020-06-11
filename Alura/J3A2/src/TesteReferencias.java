public class TesteReferencias {
    public static void main(String[] args) {

        Gerente gerente1 = new Gerente();
        gerente1.setName("Marcia");
        gerente1.setSalario(100);

        EditorVideo editor1 = new EditorVideo();
        editor1.setName("Fabia");
        editor1.setSalario(200);

        Designer designer1 = new Designer();
        designer1.setName("Ana");
        designer1.setSalario(300);

        System.out.println(gerente1.getSalario());
        System.out.println(editor1.getSalario());
        System.out.println(designer1.getSalario());

        ControleBonificacao controle = new ControleBonificacao();

        controle.registra(gerente1);
        controle.registra(editor1);
        controle.registra(designer1);
        controle.getSoma();
    }
}
