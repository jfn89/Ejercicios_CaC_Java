import static java.lang.Math.PI;

public class Funciones3JavaEjemploAnidamiento {
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
    static double superficieCilindro (double radio, double altura){
        //Superficies de tapa y piso
        double supCirculos = 2*superficieCirculo(radio);
        //Base del rectángulo
        double base = perimetroCirculo(radio);
        //Superficie del rectangulo
        double supRect = superficieRectangulo(base, altura);

        return supRect+supCirculos;
    }

    public static void main(String[] args) {
        System.out.println(superficieCilindro(5,10));
    }

}
