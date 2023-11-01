import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        AlunoCRUD crud = new AlunoCRUD();
        Scanner leitor = new Scanner(System.in);


        carregarAlunos(crud);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Incluir aluno");
            System.out.println("2 - Remover aluno");
            System.out.println("3 - Editar curso do aluno");
            System.out.println("4 - Listar alunos");
            System.out.println("5 - Sair");

            int opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    incluirAluno(crud, leitor);
                    break;
                case 2:
                    removerAluno(crud, leitor);
                    break;
                case 3:
                    editarCurso(crud, leitor);
                    break;
                case 4:
                    listarAlunos(crud);
                    break;
                case 5:
                    salvarAlunos(crud);
                    System.out.println("Programa encerrado!");
                    return;
                default:
                    System.out.println("Opção inválida, escolha novamente.");
            }
        }
    }

    private static void incluirAluno(AlunoCRUD crud, Scanner leitor) {
        System.out.print("Nome do aluno: ");
        String nome = leitor.nextLine();

        System.out.print("Curso do aluno: ");
        String curso = leitor.nextLine();

        System.out.print("Matrícula do aluno: ");
        String matricula = leitor.nextLine();

        Aluno novoAluno = new Aluno(nome, curso, matricula);
        crud.adicionarAluno(novoAluno);
        System.out.println("O aluno foi adicionado!");
    }

    private static void removerAluno(AlunoCRUD crud, Scanner leitor) {
        System.out.print("Matrícula do aluno a ser removido: ");
        String matricula = leitor.nextLine();
        boolean removido = crud.removerAluno(matricula);
        if (removido) {
            System.out.println("O aluno foi removido!");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    private static void editarCurso(AlunoCRUD crud, Scanner leitor) {
        System.out.print("Matrícula do aluno a ser editado: ");
        String matricula = leitor.nextLine();

        System.out.print("Novo curso: ");
        String novoCurso = leitor.nextLine();
        boolean atualizado = crud.atualizarCurso(matricula, novoCurso);
        if (atualizado) {
            System.out.println("O curso do aluno foi atualizado!");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    private static void listarAlunos(AlunoCRUD crud) {
        ArrayList<Aluno> listaAlunos = crud.listarAlunos();
        if (listaAlunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Lista de Alunos:");
            for (Aluno aluno : listaAlunos) {
                System.out.println(aluno);
            }
        }
    }

    private static void carregarAlunos(AlunoCRUD crud) {
        try (BufferedReader reader = new BufferedReader(new FileReader("informacoesAluno.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("|");
                if (parts.length == 3) {
                    Aluno aluno = new Aluno(parts[0], parts[1], parts[2]);
                    crud.adicionarAluno(aluno);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar alunos do arquivo: " + e.getMessage());
        }
    }

    private static void salvarAlunos(AlunoCRUD crud) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("informacoesAluno.txt"))) {
            ArrayList<Aluno> listaAlunos = crud.listarAlunos();
            for (Aluno aluno : listaAlunos) {
                writer.write(aluno.getNome() + "|" + aluno.getCurso() + "|" + aluno.getMatricula());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar alunos no arquivo: " + e.getMessage());
        }
    }
}