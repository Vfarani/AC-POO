import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        AlunoCRUD crud = new AlunoCRUD();


        Aluno aluno1 = new Aluno("12345", "Vitor", "Ciencia da computação");
        Aluno aluno2 = new Aluno("67890", "Brito", "ADS");
        crud.adicionarAluno(aluno1);
        crud.adicionarAluno(aluno2);

        ArrayList<Aluno> listaAlunos = (ArrayList<Aluno>) crud.listarAlunos();
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno);
        }
        String matriculaBusca = "202303378785";
        Aluno alunoEncontrado = crud.buscarAluno(matriculaBusca);
        if (alunoEncontrado != null) {
            System.out.println("Aluno encontrado: " + alunoEncontrado);
            crud.atualizarCurso(matriculaBusca, "Ciências da Computação");
            System.out.println("Curso atualizado: " + alunoEncontrado.getCurso());
        } else {
            System.out.println("Aluno não encontrado.");
        }
        String matriculaRemover = "67890";
        crud.removerAluno(matriculaRemover);

        listaAlunos = (ArrayList<Aluno>) crud.listarAlunos();
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno);
        }
    }

}