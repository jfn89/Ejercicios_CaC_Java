import java.util.Scanner;
/**
 * CaC Inicial
 * Desafío 3
 * Hacer un programa pida dos números por teclado, los ordene de menos a mayor e imprima los números
 * pares entre dos números.
 * {@code @author:} Juliana Novo
 */
public class Desafio11EstructurasDeRepeticionJava {
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
                if(i % 2 == 0){
                    System.out.println(i);
                }
                i++;
            } while (i <= num2);
        } else {
                i = num2;
                do {
                   if(i % 2 == 0){
                      System.out.println(i);
                   }
                   i++;
                } while (i <= num1);
        }
        miTeclado.close();
    }
}
