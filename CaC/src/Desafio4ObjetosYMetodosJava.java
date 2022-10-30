import java.util.Scanner;

/**
 * CaC Inicial
 * Desafío 2
 * Programa Java que lea dos números enteros por teclado y los muestre por pantalla.
 * {@code @author:} Juliana Novo
 */

public class Desafio4ObjetosYMetodosJava {
    public static void main(String[] args) {
        Scanner miTeclado;
        int num1;
        int num2;
        miTeclado = new Scanner (System.in);
        System.out.println("Ingrese el primer número: ");
        num1 = miTeclado.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = miTeclado.nextInt();
        System.out.println(num1);
        System.out.println(num2);
        miTeclado.close();

    }
}
