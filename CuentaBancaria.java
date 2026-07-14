// Declaramos la clase, public significa que es accesible desde cualquier otra clase del programa (incluida Main):
public class CuentaBancaria { 
    // Atributos: los datos que tiene cada cuenta. no tienen valor asignado aquí. Esto es solo la declaración de qué tipo de dato va a 
    // guardar cada cuenta — un texto (String) para el nombre, un número decimal (double) para el saldo. Es como decir "cada cuenta va a tener un titular y un saldo", pero sin decir todavía cuáles.
    String titular;
    double saldo;

    // Método: depositar dinero.
    // public: accesible desde fuera de la clase (desde Main, por ejemplo).
    // void: significa "este método no devuelve ningún valor". Solo hace algo (imprime, modifica), pero no entrega un resultado de vuelta. 
    // depositar: el nombre del método.
    // (double monto): el parámetro que recibe — un número decimal llamado monto, igual que un parámetro de función en Python.
    public void depositar(double monto) {
        saldo = saldo + monto; // saldo aquí se refiere al atributo de la clase, no a una variable nueva. El método está operando sobre los datos que pertenecen al objeto que lo llamó
        System.out.println("Depósito de $" + monto + " realizado.");
    }

    // Método: retirar dinero, con una validación simple.
    // Misma lógica que un if/else de Python, con la diferencia de sintaxis: llaves { } en vez de indentación para delimitar bloques, y no lleva : al final de la condición
    public void retirar(double monto) {
        if (monto > saldo) {
            System.out.println("Fondos insuficientes.");
        } else {
            saldo = saldo - monto;
            System.out.println("Retiro de $" + monto + " realizado.");
        }
    }

    // Método: mostrar el estado actual de la cuenta.
    // Un método sin parámetros — no necesita recibir nada porque solo usa los atributos que ya tiene la cuenta (titular, saldo)
    // El + entre comillas y variables concatena texto, igual que en Python cuando usas f-strings o +.
    public void mostrarSaldo() {
        System.out.println("Titular: " + titular + " | Saldo actual: $" + saldo);
    }
}