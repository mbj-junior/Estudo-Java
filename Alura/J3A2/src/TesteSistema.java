public class TesteSistema {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        Gerente g2 = new Gerente();

        g1.setSenha(2222);
        g2.setSenha(3333);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g1);
        si.autentica(g2);

    }
}

