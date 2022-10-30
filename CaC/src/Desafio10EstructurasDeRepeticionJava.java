import java.util.Scanner;
/**
 * CaC Inicial
 * Desafío 2
 * Hacer un programa que imprima los números en orden decreciente, desde el mayor introducido por
 * teclado al 0.
 * {@code @author:} Juliana Novo
 */
public class Desafio10EstructurasDeRepeticionJava {
    public static void main(String[] args) {
        Scanner miTeclado;
        int num, i;
        miTeclado = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        num = miTeclado.nextInt();
        if (num > 0) {
            for (i = num; i != 0; i--) {
                System.out.println(i);
            }
        } else {
            for (i = num; i != 0; i++) {
                System.out.println(i);
            }
        }
        miTeclado.close();
    }
}
