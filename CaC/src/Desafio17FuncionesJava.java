import java.util.ArrayList;
import java.util.Scanner;

/**
 * CaC Inicial
 * Desafío 1
 * a-Realizar un arraylist donde mediante una función cargarNotas se puedan cargar los datos vía teclado.
 * b-Programar una función que arroje el promedio de las notas cargadas.
 * {@code @author:} Juliana Novo
 */
public class Desafio17FuncionesJava {
    static ArrayList<Double> ingresoNotas () {
        Scanner miTeclado;
        ArrayList <Double> notasIngresadas = new ArrayList<Double>();
        miTeclado = new Scanner(System.in);
        String continuar;
        do {
            System.out.println("Ingrese la nota: ");
            notasIngresadas.add(miTeclado.nextDouble());
            miTeclado.nextLine();
            System.out.println("¿Desea ingresar otra nota?: S / N");
            continuar = miTeclado.nextLine().toUpperCase();
        } while ("S".equals(continuar));
        return notasIngresadas;
    }
    static double promedioNotas(ArrayList<Double> notas){
        double sumaNotas = 0, cantNotas, promNotas;
        for (double nota : notas){
         sumaNotas = sumaNotas + nota;
        }
        cantNotas = notas.size();
        promNotas = sumaNotas / cantNotas;
        return promNotas;
    }

    public static void main(String[] args) {
        System.out.println(promedioNotas(ingresoNotas()));
    }
}
