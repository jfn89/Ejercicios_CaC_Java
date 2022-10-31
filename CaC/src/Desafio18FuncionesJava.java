import java.util.Scanner;

/**
 * CaC Inicial
 * Desafío 1
 * Hallar la superficie y volumen de un prisma, cuyos datos podamos ingresar por teclado.
 * {@code @author:} Juliana Novo
 */
public class Desafio18FuncionesJava {
    static double perimetroRectangulo(double base, double altura){
        double perim = 2 * base + 2 * altura;
        return perim;
    }
    static double superficieRectangulo(double base, double altura){
        double sup = base * altura;
        return sup;
    }
    static double ingresoNumeros (){
        Scanner miTeclado;
        miTeclado = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        return miTeclado.nextInt();
    }

    public static void main(String[] args) {

    }
}
