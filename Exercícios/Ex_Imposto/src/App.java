import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {

        double valor = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o valor do produto ou serviço:"));

        Icms icms = new Icms();
        Iss iss = new Iss();
        Ipi ipi = new Ipi();

        double valorICMS = icms.calcular(valor);
        double valorISS = iss.calcular(valor);
        double valorIPI = ipi.calcular(valor);

        String mensagem =
                "Valor do produto/serviço: R$ " + valor +
                "\n\nICMS (18%)" +
                "\nImposto: R$ " + valorICMS +
                "\nValor Final: R$ " + (valor + valorICMS) +

                "\n\nISS (5%)" +
                "\nImposto: R$ " + valorISS +
                "\nValor Final: R$ " + (valor + valorISS) +

                "\n\nIPI (10%)" +
                "\nImposto: R$ " + valorIPI +
                "\nValor Final: R$ " + (valor + valorIPI);

        JOptionPane.showMessageDialog(null, mensagem);

    }

}