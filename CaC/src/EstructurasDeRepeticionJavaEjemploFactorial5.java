/*Realizaremos el factorial del número 5
 * Recordemos que 5! = 5*4*3*2*1;
 */

public class EstructurasDeRepeticionJavaEjemploFactorial5 {
    public static void main(String[] args) {
        //Declaracion de variables
        int n = 5; //El número a hacer factorial
        int f = 1; //El acumulador f lo inicio en 1
        int i = 1; //El conador inicia en 1

        //Bloque del bucle do-while
        do {
            f = f * i;
            i++;
        } while (i <= 5);

        System.out.println("El factorial de " + n +" es "+f);
        System.out.println(" ***El programa ha finalizado correctamente ***");
    }
}
