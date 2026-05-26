package ejercicioclass.universidad;

import java.util.HashMap;
import java.util.Map;

public class Universidad {

    private String nombre;
    private Map<Integer, Actividad> actividades = new HashMap<>();
    private Map<String, Persona> personas  = new HashMap<>();

    private static int codigoPersona;


    public static int getCodigoPersona() {
        return codigoPersona;
    }

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addActividad(String descripcion) {
        int codActividad = Actividad.getCantActividades() + 1;
        actividades.put(codActividad, new Actividad(codActividad, descripcion));
    }

    public void addPersona(String nombre, String apellido, int diaNac, int mesNac, int anioNac, Persona tipoPersona) {
        String codigo = String.valueOf(++codigoPersona);
        Persona persona;
        if (tipoPersona.getClass() == Profesor.class) {
            persona = new Profesor(codigo, nombre, apellido, diaNac, mesNac, anioNac);
        } else if (tipoPersona.getClass() == Estudiante.class) {
            persona = new Estudiante(codigo, nombre, apellido, diaNac, mesNac, anioNac);
        } else {
            persona = new Administrativo(codigo, nombre, apellido, diaNac, mesNac, anioNac);
        }

        personas.put(codigo, persona);

    }
}

