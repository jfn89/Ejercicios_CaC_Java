/*
*Queremos almacenar las notas de 10 alumnos/as de una clase.
*Calcular la media o promedio de notas
* Soluciones posibles
* 1. Crear 10 variables independientes que almacenen las notas individualmente, cargar cada variable,
*  codificar el promedio y obtener los resultados… Muchas líneas de código con seguridad.
* 2.Crear un array de 10 elementos y valernos de los métodos del array para obtener la información
* deseada… Menos líneas de código, más óptimo.
 **/

public class EstructurasDeAlmacenamientoJavaEjemploAlmacenarNotas {
    public static void main(String[] args) {
        //Declaracion del array
        int notas[];
        //Instanciación del array
        notas = new int[10]; //valores de tipo int
        //Luego cargar de a uno
        notas [0] = 8;
        notas [1] = 7;
        notas [2] = 6;
        notas [3] = 9;
        notas [4] = 10;
        notas [5] = 2;
        notas [6] = 7;
        notas [7] = 10;
        notas [8] = 6;
        notas [9] = 7;
        // O bien hacer declaración e inicialización del array
        int[] notas1={8,7,6,9,10,2,7,10,6,7};
    System.out.println (notas[5]);
    System.out.println (notas1[9]);
    }
}
