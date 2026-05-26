package ejercicioclass.universidad;

public class Administrativo extends Persona{
    public Administrativo(String codigo, String nombre, String apellido, int diaNac, int mesNac, int anioNac) {
        super(codigo, nombre, apellido, diaNac, mesNac, anioNac);
    }

    @Override
    public String toString() {
        return "[Administrativo]:"+
                "Nombre:" + nombre +
                "Apellido:" + apellido +
                "Fecha:" + fechaNac;
    }
}
