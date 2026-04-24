import java.util.ArrayList;

public class Paciente {
    private String nome;
    private ArrayList<Consulta> consultas;

    public Paciente(String nome) {
        this.nome = nome;
        this.consultas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }
}
