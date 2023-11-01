

public class Aluno {
    private String matricula;
    private String nome;
    private String curso;

    public Aluno(String matricula, String nome, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


    @Override
    public String toString() {
        return "Nome: " + nome + ", Curso: " + curso + ", Matrícula: " + matricula;
    }
}
