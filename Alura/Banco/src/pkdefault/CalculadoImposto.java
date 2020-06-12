package pkdefault;

public class CalculadoImposto {

    private double totalImposto;

    public void registra(Tributavel t){
        double valor = t.getValorImposto();
        totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
