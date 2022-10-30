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

}
