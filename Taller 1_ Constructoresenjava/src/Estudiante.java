public class Estudiante {
    // ATRIBUTOS
    private String nombre;
    private int edad;
    private String curso;

    // CONSTRUCTOR POR DEFECTO
    public Estudiante() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.curso = "Sin curso";
    }

    // CONSTRUCTOR PARAMETRIZADO
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "Sin curso"; // Asigna un valor predeterminado para el curso
    }

    // CONSTRUCTOR PARAMETRIZADO Y UTLIZA "THIS()"
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad); // Llama al constructor que acepta nombre y edad
        this.curso = curso; // Asigna el curso
    }

    // METODO PARA MOSTRAR DETALLES
    public void mostrarDetalles() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Curso: " + this.curso);
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}