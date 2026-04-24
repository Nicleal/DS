public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private String data;

    public Consulta(Paciente paciente, Medico medico, String data) {
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
    }

    public void mostrarConsulta() {
        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("Médico: " + medico.getNome());
        System.out.println("Especialidade: " + medico.getEspecialidade().getNome());
        System.out.println("Data: " + data);
        System.out.println("----------------------");
    }
}
