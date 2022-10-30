import java.util.Scanner;
/**
 * CaC Inicial
 * Desafío 4
 * Hacer un programa pida dos números por teclado, los ordene menor y mayor e imprima los números
 * impares que hay entre ambos y cuantos impares hay.
 * {@code @author:} Juliana Novo
 */
public class Desafio12EstructurasDeRepeticionJava {
    public static void main(String[] args) {
        Scanner miTeclado;
        int num1, num2, i, contador;
        miTeclado = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        num1 = miTeclado.nextInt();
        System.out.println("Ingrese otro número: ");
        num2 = miTeclado.nextInt();
        contador = 0;
        if (num1 < num2) {
            i = num1;
            do {
                if(i % 2 != 0){
                    System.out.println(i);
                    contador++;
                }
                i++;
            } while (i <= num2);
        } else {
            i = num2;
            do {
                if(i % 2 != 0){
                    System.out.println(i);
                    contador++;
                }
                i++;
            } while (i <= num1);
        }
        System.out.println(String.format("Entre los números que elegiste hay %d números impares.", contador));
        miTeclado.close();
    }
}
