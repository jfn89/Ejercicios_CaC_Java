import java.util.Scanner;

import static java.lang.Math.PI;

/**
 * CaC Inicial
 * Desafío
 * Realizar:
 * Una función que halle el perímetro y la superficie de un círculo.
 * Una función que halle el perímetro y la superficie de un rectángulo.
 * Una función que capture números del teclado.
 * Una función que imprima números
 * Una función que imprima Strings.
 * Un método main donde ejecutar todas las funciones.
 * {@code @author:} Juliana Novo
 */
public class Desafio16FuncionesJava {
    static double superficieCirculo(double radio) {
        double sup = PI * radio * radio;
        return sup;
    }
    static double perimetroCirculo(double radio){
        double perim = 2 * PI * radio;
        return perim;
    }
    static double superficieRectangulo(double base, double altura){
        double sup = base * altura;
        return sup;
    }
    static double perimetroRectangulo(double base, double altura){
        double perim = 2 * base + 2 * altura;
        return perim;
    }
    static double ingresoNumeros (){
        Scanner miTeclado;
        miTeclado = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        return miTeclado.nextInt();
    }
    static void impresionNumeros(){
        System.out.println(ingresoNumeros());
    }
    static void impresionString(String frase){
        System.out.println(frase);
    }

    public static void main(String[] args) {
        System.out.println(superficieCirculo(5));
        System.out.println(perimetroCirculo(5));
        System.out.println(superficieRectangulo(4, 5));
        System.out.println(perimetroRectangulo(4, 5));
        impresionNumeros();
        impresionString("Hola mundo");
    }
}
