import java.util.ArrayList;

public class Profesor extends Usuario {

    private ArrayList<String> comisiones = new ArrayList();
//Constructor
    public Profesor(Integer dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
    }
//Getters n Setters
    public ArrayList<String> getComisiones() {
        return comisiones;
    }

    public void setComisiones(ArrayList<String> comisiones) {
        this.comisiones = comisiones;
    }
//Metodo
    public void imprimirComisiones() {
        System.out.println("");
        System.out.println("Comisiones:");

        for (int i = 0; i < comisiones.size(); i++) {
            System.out.println(comisiones.get(i));
        }

        System.out.println("");
    }
}