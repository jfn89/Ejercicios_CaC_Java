import java.util.Scanner;

/**
 * CaC Inicial
 * Desafío 4
 * Programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble y el 1/2;
 * {@code @author:} Juliana Novo
 */

public class Desafio6ObjetosYMetodosJava {
    public static void main(String[] args) {
        Scanner miTeclado;
        double num1;
        int doble;
        double mitad;
        miTeclado = new Scanner (System.in);
        System.out.println("Ingrese su número: ");
        num1 = miTeclado.nextInt();
        doble = (int) num1 * 2;
        mitad = num1 / 2;
        System.out.println(String.format("El doble de %d es %d",(int) num1, doble));
        System.out.println(String.format("La mitad de %d es %f",(int) num1, mitad));

        miTeclado.close();

    }
}
