import java.util.Scanner;

/**
 * CaC Inicial
 * Desafío 1
 * Hallar la superficie y volumen de un prisma, cuyos datos podamos ingresar por teclado.
 * {@code @author:} Juliana Novo
 */
public class Desafio18FuncionesJava {
    static double superficieRectangulo(double base, double altura){
        double sup = base * altura;
        return sup;
    }
    static double superficiePrisma(double longitud, double ancho, double altura){
        double supCarasA = 2 * superficieRectangulo(longitud, ancho);
        double supCarasB = 2 * superficieRectangulo(ancho, altura);
        double supCarasC = 2 * superficieRectangulo(longitud, altura);
        return supCarasA + supCarasB + supCarasC;
    }

    static double volumenPrisma(double longitud, double ancho, double altura){
        double vol = longitud * ancho * altura;
        return vol;
    }

    public static void main(String[] args) {
        Scanner miTeclado;
        miTeclado = new Scanner(System.in);
        System.out.println("Vamos a calcular el área y volumen de un prisma");
        System.out.println(" ");
        System.out.println("Ingrese la longitud: ");
        double longitud = miTeclado.nextDouble();
        miTeclado.nextLine();
        System.out.println("Ingrese el ancho: ");
        double ancho = miTeclado.nextDouble();
        miTeclado.nextLine();
        System.out.println("Ingrese la altura: ");
        double altura = miTeclado.nextDouble();
        miTeclado.nextLine();
        double volumen = volumenPrisma(longitud, ancho, altura);
        double superficie = superficiePrisma(longitud, ancho, altura);
        System.out.println(" ");
        System.out.println("La superficie del prisma es " + superficie + " y el volumen es " + volumen );
    }
}
