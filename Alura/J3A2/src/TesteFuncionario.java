public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.setName("Marcio");
        funcionario1.setCpf("12312312322");
        funcionario1.setSalario(3000);

        System.out.println(funcionario1.getName() + " " +
                            funcionario1.getSalario());

        System.out.println(funcionario1.getName() + " " +
                            funcionario1.getBonificacao() + " " +
                            funcionario1.getSalario());

    }
}
