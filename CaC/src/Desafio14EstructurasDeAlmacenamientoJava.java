import java.util.ArrayList;
import java.util.Scanner;

/**
 * CaC Inicial
 * Desafío 2
 * 1.Programar una aplicación que utilice un arraylist para cargar un listado de cosas a comprar en
 * el supermercado.
 * 2.Permitir al usuario cargar en un buscador el producto y si el producto está en el listado que
 * arroje un aviso “Si, tenés que comprar el producto”
 * {@code @author:} Juliana Novo
 */
public class Desafio14EstructurasDeAlmacenamientoJava {
    public static void main(String[] args) {
        Scanner miTeclado;
        String continuar, buscar;
        int buscador;
        miTeclado = new Scanner(System.in);
        ArrayList<String> listaCompras = new ArrayList<String>();
        do {
            System.out.println("Ingresá el producto que querés agregar a tu lista de compras: ");
            listaCompras.add(miTeclado.nextLine().toUpperCase());
            System.out.println("¿Desea ingresar otro producto?: S / N");
            continuar = miTeclado.nextLine().toUpperCase();
        } while ("S".equals(continuar));
        System.out.println(listaCompras);
        do {
            System.out.println("¿Qué producto deseas buscar?");
            buscador = listaCompras.indexOf(miTeclado.nextLine().toUpperCase());
            if (buscador >= 0) {
                System.out.println("Sí, tenés que comprar el producto.");
            }
            System.out.println("¿Desea buscar otro producto?: S / N");
            buscar = miTeclado.nextLine().toUpperCase();
        } while ("S".equals(buscar));
        miTeclado.close();
    }
}
