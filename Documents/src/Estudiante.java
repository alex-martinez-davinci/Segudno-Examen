import java.util.ArrayList;

public class Estudiante extends Usuario {
    private String carrera;
    private ArrayList<String> matesAprobadas = new ArrayList<String>();
    private ArrayList<String> matesInscriptas = new ArrayList<String>();;
//Constructores
    public Estudiante(Integer dni, String nombre, String apellido, String carrera) {
        super(dni, nombre, apellido);
        this.carrera = carrera;
    }
//Getters n Setters
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public ArrayList<String> getMatesAprobadas() {
        return matesAprobadas;
    }

    public void setMatesAprobadas(ArrayList<String> matesAprobadas) {
        this.matesAprobadas = matesAprobadas;
    }

    public ArrayList<String> getMatesInscriptas() {
        return matesInscriptas;
    }

    public void setMatesInscriptas(ArrayList<String> matesInscriptas) {
        this.matesInscriptas = matesInscriptas;
    }
//Metodos

    public String imprimirMatesAprobadas(){
        return "Materias aprobadas: " + "\n" + getMatesAprobadas();
    }

    public String imprimirMatesInscriptas(){
        return "Materias inscriptas: " + "\n" + getMatesInscriptas();
    }

}