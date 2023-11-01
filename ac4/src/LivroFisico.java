public class LivroFisico {
    private String titulo;
    private String autor;
    private boolean reservado;
    private boolean emprestado;

    public LivroFisico(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.reservado = false;
        this.emprestado = false;
    }

    public void reservar() {
        if (!emprestado) {
            if (!reservado) {
                reservado = true;
                System.out.println("Livro físico '" + titulo + "' de '" + autor + "' reservado com sucesso.");
            } else {
                System.out.println("Livro físico '" + titulo + "' de '" + autor + "' já está reservado.");
            }
        } else {
            System.out.println("Livro físico '" + titulo + "' de '" + autor + "' não pode ser reservado, pois está emprestado.");
        }
    }

    public void cancelarReserva() {
        if (reservado) {
            reservado = false;
            System.out.println("Reserva do livro físico '" + titulo + "' de '" + autor + "' foi cancelada.");
        } else {
            System.out.println("Não há reserva para o livro físico '" + titulo + "' de '" + autor + "'.");
        }
    }

    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro físico '" + titulo + "' de '" + autor + "' emprestado com sucesso.");
        } else {
            System.out.println("Livro físico '" + titulo + "' de '" + autor + "' já está emprestado.");
        }
    }

    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro físico '" + titulo + "' de '" + autor + "' devolvido com sucesso.");
        } else {
            System.out.println("Livro físico '" + titulo + "' de '" + autor + "' não está emprestado.");
        }
    }
}