public class Usuario {

    private Integer dni;
    private String nombre;
    private String apellido;
//Constructores
    public Usuario(Integer dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }
//Getters n Setters
    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
//toString
    @Override
    public String toString() {
        return "El dni del " + Usuario.class.getName() + " es: " + getDni();
    }
}