import java.util.Scanner;

public class Constructores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // PARA CREAR OBJETO DE LIBRO UTILIZANDO EL CONSTRUCTOR POR DEFECTO
        Libro libro1 = new Libro();
        System.out.println("Detalles del libro por defecto:");
        System.out.println(libro1.toString());

        // DATOS PARA LIBRO
        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese el número de páginas: ");
        int numeroPaginas = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        Libro libro2 = new Libro(titulo, autor, numeroPaginas);
        System.out.println("Detalles del libro ingresado:");
        System.out.println(libro2.toString());

        // PARA CREAR OBJETO DE CUENTABANCARIA UTILIZANDO EL CONSTRUCTOR POR DEFECTO
        CuentaBancaria cuenta1 = new CuentaBancaria();
        System.out.println("\nDetalles de la cuenta bancaria por defecto:");
        System.out.println(cuenta1.toString());

        // DATOS PARA CUENTA BANCARIA
        System.out.print("Ingrese el número de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        System.out.print("Ingrese el tipo de cuenta: ");
        String tipoCuenta = scanner.nextLine();
        CuentaBancaria cuenta2 = new CuentaBancaria(numeroCuenta, tipoCuenta);
        System.out.println("Detalles de la cuenta bancaria ingresada:");
        System.out.println(cuenta2.toString());

        // PARA CREAR OBJETO DE ESTUDIANTE UTILIZANDO EL CONSTRUCTOR POR DEFECTO
        Estudiante estudiante1 = new Estudiante();
        System.out.println("\nDetalles del estudiante por defecto:");
        System.out.println(estudiante1.toString());

        // DATOS DE ESTUDIANTE
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = scanner.nextLine();
        System.out.print("Ingrese la edad del estudiante: ");
        int edadEstudiante = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese el curso del estudiante: ");
        String cursoEstudiante = scanner.nextLine();
        Estudiante estudiante2 = new Estudiante(nombreEstudiante, edadEstudiante, cursoEstudiante);
        System.out.println("Detalles del estudiante ingresado:");
        System.out.println(estudiante2.toString());

        
        scanner.close();
    }
}