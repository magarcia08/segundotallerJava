package ejercicioclass.universidad;

public class Profesor  extends  Persona {

    public Profesor() {
    }

    public Profesor(String codigo, String nombre, String apellido, int diaNac, int mesNac, int anioNac) {
        super(codigo, nombre, apellido, diaNac, mesNac, anioNac);
    }

    @Override
    public String toString() {
        return "[Profesor]:"+
                "Nombre:" + nombre +
                "Apellido:" + apellido +
                "Fecha:" + fechaNac;
    }

}
