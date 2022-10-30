import java.util.Scanner;
/**
 * CaC Inicial
 * Desafío 5
 * Como Usuario quiero ingresar por teclado mi nombre y tres números para que me devuelva por consola un saludo personalizado
 * me muestre los números que introduje y además la suma de los tres números con la leyenda “La suma de los tres números es: ”
 * Mediante flujos de entrada y salida
 * 1. Instanciar un objeto “miTeclado”.
 * 2. Crear una variable “nombre” como String.
 * 3. Crear una variable num1, num2, num3 como int.
 * 4. Realizar la insinstruccióntruccion de salida “Ingrese su nombre: ” mediante System.out.println().
 * 5. Realizar la instrucción de entrada que almacene el nombre en la variable “nombre”.
 * 6. Realizar la instrucción de salida “Ingrese el primer número: ” mediante System.out.println().
 * 7. Realizar la instrucción de entrada que almacene el primer número en “num1”.
 * 8. Realizar la instrucción de salida “Ingrese segundo número: ” mediante System.out.println().
 * 9. Realizar la instrucción de entrada que almacene el segundo número en “num2”.
 * 10. Realizar un flujo secuencial simple donde sumamos num1 + num 2 y lo almacenamos dentro de una variable que llamaremos
 * resultado.
 * 11. Realizar la instrucción de salida del resultado y el saludo System.out.println().
 * {@code @author:} Juliana Novo
 */

public class Desafio7ObjetosYMetodosJava {
    public static void main (String [] args ){
        Scanner miTeclado;
        String nombre;
        int num1, num2, num3, resultado;
        miTeclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = miTeclado.nextLine();
        System.out.println("Ingrese el primer número: ");
        num1 = miTeclado.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = miTeclado.nextInt();
        System.out.println("Ingrese el tercer número: ");
        num3 = miTeclado.nextInt();
        resultado = num1 + num2 + num3;
        System.out.println(String.format("Hola %s!!! La suma de los tres números que ingresaste es: %d", nombre , resultado));
        miTeclado.close();
    }
}
