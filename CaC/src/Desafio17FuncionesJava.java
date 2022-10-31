import java.util.ArrayList;
import java.util.Scanner;

/**
 * CaC Inicial
 * Desafío 1
 * a-Realizar un arraylist donde mediante una función cargarNotas se puedan cargar los datos vía teclado.
 * b-Programar una función que arroje el promedio de las notas cargadas.
 * Desafío 2
 * Colocar la función cargaNotas dentro de un bucle while que pregunte si deseo cargar otro dato.
 * Desafío 3
 * Colocar toda la estructura anterior dentro de un switch cuyos menúes sean:
 * 1.Visualizar los datos cargados
 * 2.Obtener el promedio
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
        Scanner miTeclado;
        ArrayList <Double> notas = new ArrayList<Double>();
        miTeclado = new Scanner(System.in);
        int opcion = 0;
        System.out.println("##### Ingresando y promediando notas ####");
        notas = ingresoNotas();
        System.out.println("##### Menu ####");
        System.out.println("1.Visualizar los datos cargados");
        System.out.println("2.Obtener el promedio");
        System.out.println("Elegí la opción deseada: ");
        opcion = miTeclado.nextInt();
        miTeclado.nextLine();
        switch (opcion){
            case opcion == 1:
            System.out.println(notas);
            break;
            case opcion == 2:
            System.out.println(promedioNotas(notas));
            break;
        }

    }
}
