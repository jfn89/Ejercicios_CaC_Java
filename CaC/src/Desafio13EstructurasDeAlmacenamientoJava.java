import java.util.Scanner;

/**
 * CaC Inicial
 * Desafío 1
 * Hacer un array que me permita la carga por teclado de 10 notas de clases, terminada la carga
 * arrojará, las notas cargadas y el promedio de ellas.
 * {@code @author:} Juliana Novo
 */
public class Desafio13EstructurasDeAlmacenamientoJava {
    public static void main(String[] args) {
        Scanner miTeclado;
        int notas[];
        int cont, acumulador;
        cont = 0;
        acumulador = 0;
        miTeclado = new Scanner(System.in);
        notas = new int[10];
        for (int i : notas) {
            System.out.println("Ingrese su nota: ");
            notas[cont] = miTeclado.nextInt();
            cont++;
        }
        System.out.println("Sus notas son: ");
        for (int i : notas) {
            System.out.println(i);
            acumulador += i;
            i++;
        }
        System.out.println(acumulador);
        System.out.println(String.format("Su promedio es: %d.", (acumulador/10)));
        miTeclado.close();
    }
}
