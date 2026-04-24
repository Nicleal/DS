public class Main {
    public static void main(String[] args) {

        Especialidade cardio = new Especialidade("Cardiologia");
        Especialidade orto = new Especialidade("Ortopedia");

        Medico medico1 = new Medico("Dr. João", cardio);
        Medico medico2 = new Medico("Dra. Maria", orto);

        Paciente paciente1 = new Paciente("Carlos");

        Consulta consulta1 = new Consulta(paciente1, medico1, "20/04/2026");
        Consulta consulta2 = new Consulta(paciente1, medico2, "22/04/2026");

        paciente1.adicionarConsulta(consulta1);
        paciente1.adicionarConsulta(consulta2);

        for (Consulta c : paciente1.getConsultas()) {
            c.mostrarConsulta();
        }
    }
}
