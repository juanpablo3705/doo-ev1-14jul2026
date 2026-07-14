public class TiposDeDatos {
    public static void main(String[] args) {
        // Números enteros
        int edad = 19;
        int anioNacimiento = 2007;

        // Números decimales
        double precioAuto = 8500000.50;
        float temperatura = 18.5f;

        // Texto
        String nombre = "Juan Pablo";
        char inicial = 'J';

        // Verdadero o falso
        boolean esEstudiante = true;
        boolean tieneAuto = false;

        // Operadores aritméticos
        int añoActual = 2026;
        int edadCalculada = añoActual - anioNacimiento;

        // Operadores de comparación
        boolean esMayorDeEdad = edad >= 18;

        // Concatenación e impresión
        System.out.println("Nombre: " + nombre + " " + inicial + ".");
        System.out.println("Edad declarada: " + edad);
        System.out.println("Edad calculada desde año de nacimiento: " + edadCalculada);
        System.out.println("¿Es mayor de edad? " + esMayorDeEdad);
        System.out.println("Precio del auto: $" + precioAuto);
        System.out.println("¿Es estudiante? " + esEstudiante);
        System.out.println("¿Tiene auto? " + tieneAuto);

        // Operador módulo, muy usado en programación
        int resultadoModulo = edad % 2;
        System.out.println("Resto de edad dividida por 2: " + resultadoModulo);
    }
}