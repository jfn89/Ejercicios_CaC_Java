import java.util.Scanner;

/**
 * CaC Inicial
 * Desafío 3
 * Hacer un array que me permita la carga por teclado el tamaño del arreglo, luego cargar datos,
 * terminada la carga arrojará, los datos cargados.
 * {@code @author:} Juliana Novo
 */
public class Desafio15EstructurasDeAlmacenamientoJava {
    public static void main(String[] args) {
        Scanner miTeclado;
        String[] productos;
        int cont, indice;
        cont = 0;
        miTeclado = new Scanner(System.in);
        System.out.println("¿Cuántos productos vas a ingresar en la lista?: ");
        indice = miTeclado.nextInt();
        miTeclado.nextLine();
        productos = new String[indice];
        for (String i : productos){
            System.out.println("¿Ingresá el producto?: ");
            productos[cont] = miTeclado.nextLine();
            cont = cont + 1;
        }
        for (String i : productos) {
            System.out.println(i);
        }
        miTeclado.close();
    }
}
