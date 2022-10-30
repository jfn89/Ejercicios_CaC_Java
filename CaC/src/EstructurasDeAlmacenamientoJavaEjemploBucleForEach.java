public class EstructurasDeAlmacenamientoJavaEjemploBucleForEach {
    public static void main(String[] args) {
        //Declaración e Inicializacion del array
        String[] autos = {"Volvo", "Taunus", "Toyota", "Torino","Dodge"};
        //Declaro un contador
        int cont = 1;

        //Bucle for-each para imprimir en consola los elementos del array

        for (String i : autos) {
            System.out.println("El elemento "+cont+" del array autos es "+ i);
            cont ++;
        }
        System.out.println("*** El programa ha finalizado ***");

    }
}
