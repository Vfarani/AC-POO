public class Ebook {
    private String titulo;
    private String autor;
    private String formato;
    private boolean reservado;
    private boolean emprestado;

    public Ebook(String titulo, String autor, String formato) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.reservado = false;
        this.emprestado = false;
    }

    public void reservar() {
        if (!emprestado) {
            if (!reservado) {
                reservado = true;
                System.out.println("E-book '" + titulo + "' de '" + autor + "' no formato '" + formato + "' reservado com sucesso.");
            } else {
                System.out.println("E-book '" + titulo + "' de '" + autor + "' no formato '" + formato + "' já está reservado.");
            }
        } else {
            System.out.println("E-book '" + titulo + "' de '" + autor + "' no formato '" + formato + "' não pode ser reservado, pois está emprestado.");
        }
    }

    public void cancelarReserva() {
        if (reservado) {
            reservado = false;
            System.out.println("Reserva do e-book '" + titulo + "' de '" + autor + "' no formato '" + formato + "' foi cancelada.");
        } else {
            System.out.println("Não há reserva para o e-book '" + titulo + "' de '" + autor + "' no formato '" + formato + "'.");
        }
    }

    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("E-book '" + titulo + "' de '" + autor + "' no formato '" + formato + "' emprestado com sucesso.");
        } else {
            System.out.println("E-book '" + titulo + "' de '" + autor + "' no formato '" + formato + "' já está emprestado.");
        }
    }

    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("E-book '" + titulo + "' de '" + autor + "' no formato '" + formato + "' devolvido com sucesso.");
        } else {
            System.out.println("E-book '" + titulo + "' de '" + autor + "' no formato '" + formato + "' não está emprestado.");
        }
    }
}