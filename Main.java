public class Main {
    public static void main(String[] args) {

        System.out.println("---- Cuenta Ahorros ----");
        CuentaAhorros ahorro = new CuentaAhorros(15000, 3);
        ahorro.consignar(2000);
        ahorro.retirar(1000);
        ahorro.extractoMensual();
        ahorro.imprimir();

        System.out.println("\n---- Cuenta Corriente ----");
        CuentaCorriente corriente = new CuentaCorriente(5000, 3);
        corriente.retirar(7000);
        corriente.consignar(3000);
        corriente.imprimir();
    }
}