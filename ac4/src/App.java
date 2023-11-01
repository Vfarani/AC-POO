public class App {
    public static void main(String[] args) {
        LivroFisico livro1 = new LivroFisico("Aventuras em Java", "João Autor");
        Ebook ebook1 = new Ebook("Programação Java Avançada", "João Autor", "PDF");

        livro1.emprestar();
        livro1.reservar();
        ebook1.reservar();
        ebook1.cancelarReserva();

        livro1.emprestar();
        livro1.emprestar();
        livro1.devolver();
    }
}
