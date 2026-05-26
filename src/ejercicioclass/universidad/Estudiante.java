package ejercicioclass.universidad;

public  class Estudiante extends Persona{

    public Estudiante() {
        super();
    }

    public Estudiante(String codigo, String nombre, String apellido, int diaNac, int mesNac, int anioNac) {
        super(codigo, nombre, apellido, diaNac, mesNac, anioNac);
    }

    @Override
    public String toString() {
        return "[Estudiante]:"+
                "Nombre:" + nombre +
                "Apellido:" + apellido +
                "Fecha:" + fechaNac;
    }
}
