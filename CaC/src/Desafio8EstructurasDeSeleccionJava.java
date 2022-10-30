import java.util.Scanner;
/**
 * CaC Inicial
 * Desafío
 * Programar un sistema de créditos que pida el nombre del usuario y su ingreso medio,
 * A partir de los datos ingresados  el programa arrojará el máximo crédito disponible.
 * Las lineas de crédito son
 * Ingresos inferiores a $ 50000 son clase A
 * Ingresos entre $50000 y 100000 son clase B
 * Ingresos mayores a 100000 son clase C
 * En todos los casos el valor de la cuota no debe superar 1/3 del ingreso
 * Hasta en 24 cuotas
 * {@code @author:} Juliana Novo
 */

public class Desafio8EstructurasDeSeleccionJava {
    public static void main (String [] args){
        Scanner miTeclado;
        String nombre;
        int ingresoMedio, creditoMaximo, cuotas, cuotaMaxima;
        miTeclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = miTeclado.nextLine();
        System.out.println("Ingrese su ingreso medio: ");
        ingresoMedio = miTeclado.nextInt();
        System.out.println("Ingrese la cantidad de cuotas (hasta 24): ");
        cuotas = miTeclado.nextInt();
        cuotaMaxima = ingresoMedio / 3;
        creditoMaximo = cuotaMaxima * cuotas;
        String mensaje = "";
        if (ingresoMedio < 50000) {
            mensaje = String.format("%s como tu ingreso medio es %d tu línea de crédito es clase A. El máximo crédito disponible es %d en %d cuotas", nombre , ingresoMedio, creditoMaximo, cuotas);
        } else if (50000 >= ingresoMedio && ingresoMedio < 100000) {
            mensaje = String.format("%s como tu ingreso medio es %d tu línea de crédito es clase B. El máximo crédito disponible es %d en %d cuotas", nombre , ingresoMedio, creditoMaximo, cuotas);
        } else {
            mensaje = String.format("%s como tu ingreso medio es %d tu línea de crédito es clase C. El máximo crédito disponible es %d en %d cuotas", nombre , ingresoMedio, creditoMaximo, cuotas);
        }
        System.out.println(mensaje);
        miTeclado.close();
    }
}
