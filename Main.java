public class Main {
    public static void main(String[] args) { // static significa que este método pertenece a la clase en sí, no a un objeto
        // Creamos un objeto de tipo CuentaBancaria
        CuentaBancaria cuentaJuanPablo = new CuentaBancaria();

        // Le asignamos valores a sus atributos
        cuentaJuanPablo.titular = "Juan Pablo";
        cuentaJuanPablo.saldo = 50000;

        // Usamos sus métodos
        cuentaJuanPablo.mostrarSaldo();
        cuentaJuanPablo.depositar(20000);
        cuentaJuanPablo.retirar(15000);
        cuentaJuanPablo.retirar(1000000);
        cuentaJuanPablo.mostrarSaldo();
    }
}