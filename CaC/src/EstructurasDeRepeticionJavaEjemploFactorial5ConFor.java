/*Realizaremos el factorial del número 5 recorriendo con el ciclo for
 * Recordemos que 5! = 5*4*3*2*1;
 */

public class EstructurasDeRepeticionJavaEjemploFactorial5ConFor {
    public static void main(String[] args) {
        //Declaracion de variables
        int n = 5; //El número a hacer factorial
        int f = 1; //El acumulador f lo inicio en 1
        int i = 1; //Condicion

        //Bloque for
        for (i = 1; i<=5; i++){
            f = f*i;
        }

        System.out.println("El factorial de "+n+" es " +f);
        System.out.println("*** El programa ha finalizado correctamente ***");
    }
}
