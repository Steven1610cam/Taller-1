public class CuentaBancaria {
    // ATRIBUTOS
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    // CONSTRUCTOR POR DEFECTO
    public CuentaBancaria() {
        this.numeroCuenta = "00000000";
        this.saldo = 0.0;
        this.tipoCuenta = "Ahorros";
    }

    // CONSTRUCTOR PARAMETRIZADO
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0; // Inicializa saldo a 0 por defecto
        this.tipoCuenta = tipoCuenta;
    }

    // CONSTRUCTOR SOBRECARGADO
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    // METODO PARA MOSTRAR DETALLES
    public void mostrarDetalles() {
        System.out.println("Número de Cuenta: " + this.numeroCuenta);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Tipo de Cuenta: " + this.tipoCuenta);
    }

    
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
}