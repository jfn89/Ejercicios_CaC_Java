/**
 * CaC Inicial
 * Desafío 2
 * Para mostrar la calificación de un alumno, es necesario evaluar las condiciones
 * que se indican en la siguiente tabla.
 * Calificación                Mostrar por consola
 * 10                          Matrícula de Honor.
 * 9                           Sobresaliente
 * 7, 8                        Notable
 * 6                           Bien
 * 5                           Aprobado
 * 0, 1, 2, 3, 4               Suspenso
 * {@code @author:} Juliana Novo
 */
public class Desafio2EstructurasJava {
    public static void main (String[] args) {
        int notaAlumno;
        notaAlumno = 9;
        if (notaAlumno == 10) {
            System.out.println("Matrícula de Honor.");
        } else if (notaAlumno == 9) {
            System.out.println("Sobresaliente.");
        } else if (notaAlumno < 9 && notaAlumno > 6 ) {
            System.out.println("Notable.");
        } else if (notaAlumno == 6) {
            System.out.println("Bien.");
        } else if (notaAlumno == 5) {
            System.out.println("Aprobado.");
        } else {
            System.out.println("Suspenso.");
        }
    }
}

