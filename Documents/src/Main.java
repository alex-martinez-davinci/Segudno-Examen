import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Profesor profesor = new Profesor(100, "John", "Doe");
        Estudiante estudiante = new Estudiante(43327436, "Alex", "Martinez", "Analista de Sistemas");

        estudiante.getMatesAprobadas().add("3");
        estudiante.getMatesInscriptas().add("2");

        System.out.println(profesor);
        System.out.println(estudiante);

        System.out.println(estudiante.imprimirMatesAprobadas());
        System.out.println(estudiante.imprimirMatesInscriptas());
    }
}