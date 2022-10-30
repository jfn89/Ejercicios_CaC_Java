import java.util.Scanner;
/**
 * CaC Inicial
 * Desafío 3
 * Hacer una aplicación que permita ingresar 2 números y mostrar sus operaciones básicas.
 * {@code @author:} Juliana Novo
 */

public class Desafio5ObjetosYMetodosJava {
    public static void main(String[] args) {
        Scanner miTeclado;
        int num1;
        int num2;
        int suma;
        int resta;
        int multiplicacion;
        int division;
        int modulo;
        int potencia;
        miTeclado = new Scanner (System.in);
        System.out.println("Ingrese el primer número: ");
        num1 = miTeclado.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = miTeclado.nextInt();
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        modulo = num1 % num2;
        potencia = (int) Math.pow(num1, num2);
        System.out.println(String.format("La suma de %d y %d es: %d " , num1, num2, suma));
        System.out.println(String.format("La resta de %d y %d es: %d " , num1, num2, resta));
        System.out.println(String.format("La multiplicación de %d y %d es: %d " , num1, num2, multiplicacion));
        System.out.println(String.format("La división de %d y %d es: %d " , num1, num2, division));
        System.out.println(String.format("El módulo de %d y %d es: %d " , num1, num2, modulo));
        System.out.println(String.format("El número %d elevado a %d da como resultado: %d " , num1, num2, potencia));
        miTeclado.close();

    }
}
