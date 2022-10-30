import java.util.Scanner;

/**
 * CaC Inicial
 * Desafío 1
 * Como Usuario quiero ingresar por teclado mi nombre y dos números para que me devuelva un
 * saludo personalizado por consola y la suma de los dos números con la leyenda “La suma de
 * los dos números es: ”
 * Mediante flujos de entrada y salida hacer
 * 1.Instanciar un objeto “miTeclado”.
 * 2.Crear una variable “nombre” como String.
 * 3.Crear una variable “num1” como int.
 * 4.Crear una variable “num2” como int.
 * 5.Inicializar TODO.
 * 6.Realizar la instrucción de salida “Ingrese su nombre: ” mediante System.out.println().
 * 7.Realizar la instrucción de entrada que almacene el nombre en la variable “nombre”.
 * 8.Realizar la instrucción de salida “Ingrese el primer número: ” mediante System.out.println().
 * 9.Realizar la instrucción de entrada que almacene el primer número en “num1”.
 * 10.Realizar la instrucción de salida “Ingrese segundo número: ” mediante System.out.println().
 * 11.Realizar la instrucción de entrada que almacene el segundo número en “num2”.
 * 12.Realizar un flujo secuencial simple donde sumamos num1 + num 2 y lo almacenamos dentro de
 * una variable que llamaremos resultado.
 * 13.Realizar la instrucción de salida del resultado y el saludo System.out.println().
 * {@code @author:} Juliana Novo
 */
public class Desafio3ObjetosYMetodosJava {
    public static void main(String[] args) {
        Scanner miTeclado;
        String nombre;
        int num1;
        int num2;
        int resultado;
        miTeclado = new Scanner (System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = miTeclado.nextLine();
        System.out.println("Ingrese el primer número: ");
        num1 = miTeclado.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = miTeclado.nextInt();
        resultado = num1 + num2;
        System.out.println("Hola " + nombre + " ¿Cómo estás?");
        System.out.println("La suma de los dos números es: " + resultado);

        miTeclado.close();

    }
}
