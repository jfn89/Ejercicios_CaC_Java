import java.util.Scanner;
/**
 * CaC Inicial
 * Desafío 1
 * Hacer un programa que imprima los números entre dos números a ingresar por teclado.
 * {@code @author:} Juliana Novo
 */
public class Desafio9EstructurasDeRepeticionJava {
    public static void main(String[] args) {
        Scanner miTeclado;
        int num1, num2, i;
        miTeclado = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        num1 = miTeclado.nextInt();
        System.out.println("Ingrese otro número: ");
        num2 = miTeclado.nextInt();
        if (num1 < num2) {
        i = num1;
        do {
            System.out.println(i);
            i++;
        } while (i <= num2);
        } else {
            i = num2;
            do {
                System.out.println(i);
                i++;
            } while (i <= num1);
        }
        miTeclado.close();
    }
}
