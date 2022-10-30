//Zona de librerías
import java.util.Scanner;
/*
 * Para este ejercicio vamos a crear una función que es un sistema de validación de un usuario
 * que recibe un usuario y una contraseña y según sean válidos o no, muestra un mensaje al usuario.
 * */
public class Funciones1JavaEjemploClaseValidacion {
    //Zona de funciones
    static void verificar(String usuario, String pass){
        String usuarioValido = "Codo";
        String passValido = "2022";

        //Validacion de datos
        if(usuarioValido.equals(usuario) && passValido.equals(pass)){
            //Saludo por instruccion de salida
            System.out.println("Hola " + usuario + " tu ingreso fue exitoso");
            return;// Terminamos la ejecucion
        }
        //Si los datos no son válidos
        System.out.println("Lo siento no pudimos validar tus datos, intentalo nuevamente");
    }

    public static void main(String[] args) {
        //Inicializar variables
        String usuar;
        String contr;

        //Declaramos un objeto scanner
        Scanner miTeclado;

        //Instanciamos el objeto - lo inicializamos
        miTeclado = new Scanner(System.in);

        //Instrucciones de Salida-Entrada
        System.out.println("Ingrese su nombre");
        usuar = miTeclado.nextLine();
        System.out.println("Ingrese su clave");
        contr = miTeclado.nextLine();

        //Utilizamos la funcion
        verificar(usuar,contr);
    }
}
