public class Medico {
    private String nome;
    private Especialidade especialidade;

    public Medico(String nome, Especialidade especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }
}
