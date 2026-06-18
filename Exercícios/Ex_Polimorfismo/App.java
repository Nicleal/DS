public class Aplicacao {

    public static void main(String[] args) {

        ControleDeAumento controle = new ControleDeAumento();

        Gerente gerente = new Gerente();
        gerente.setNome("Carlos");
        gerente.setCpf("111.111.111-11");
        gerente.setSalario(5000);
        gerente.setMatricula("G001");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Ana");
        funcionario.setCpf("222.222.222-22");
        funcionario.setSalario(4000);

        controle.registrar(gerente);
        controle.registrar(funcionario);

        System.out.println("Valor aumento do gerente: "
                + gerente.aumentarSalario());

        System.out.println("Valor aumento do funcionário: "
                + funcionario.aumentarSalario());

        System.out.println("Total de aumento: "
                + controle.getTotalDeAumento());
    }
}
