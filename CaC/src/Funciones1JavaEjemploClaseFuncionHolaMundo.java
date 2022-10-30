/*
 * Práctico de Clases Hola Mundo con distintos métodos void o procedimientos
 * La numeracion obedece al orden en que se enseñara en clases
 */
public class Funciones1JavaEjemploClaseFuncionHolaMundo {
    //2- Metodo static sin recepcion de parámetros
    static void saludo(){
        System.out.println("Hola mundo");
    }
    //3- Método static con recepcion de parámetros
    static void saludo(String nombre){
        System.out.println("Hola "+ nombre);
    }
    //5- Sobrecarga del método
    static void saludo(int num1, int num2){
        System.out.println("Hola la suma de tus numeros es "+(num1+num2));
    }
    //4- Método static para despedir
    static void despedida(){
        System.out.println("El programa ha finalizado, adios");
    }
    public static void main(String[] args) {
        //1- Hacemos un hola mundo de manera convencional
        //Declaracion de variables
        String nombre = "Mundo" ;
        //Instruccion de salida
        System.out.println("Hola " + nombre);

        //Utilizando funciones o métodos static
        saludo();
        saludo("Mundo");
        saludo("Codo a Codo");
        saludo(56,48);
        despedida();
    }
}
