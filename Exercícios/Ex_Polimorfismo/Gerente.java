public class Gerente extends Funcionario {

    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override 
    public double aumentarSalario() {
        return getSalario() * 0.20;
    }
}
