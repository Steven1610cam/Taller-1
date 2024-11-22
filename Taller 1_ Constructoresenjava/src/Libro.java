public class Libro {
    // ATRIBUTOS
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // CONSTRUCTOR POR DEFECTO
    public Libro() {
        this.titulo = "Sin título";
        this.autor = "Desconocido";
        this.numeroPaginas = 0;
    }

    // CONSTRUCTOR PARAMETRIZADO
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // METODO PARA MOSTRAR DETALLES
    public void mostrarDetalles() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de Páginas: " + this.numeroPaginas);
    }

   
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}