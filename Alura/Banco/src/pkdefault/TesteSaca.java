package pkdefault;

public class TesteSaca {

    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 333);

        conta.deposita(200);
        System.out.println(conta.getSaldo());
        conta.saca(100);
        System.out.println(conta.getSaldo());
        conta.saca(100);
        System.out.println(conta.getSaldo());

    }

}
