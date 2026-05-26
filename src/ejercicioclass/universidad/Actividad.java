package ejercicioclass.universidad;

import java.util.Map;

public class Actividad {
    private int codigo;
    private String descripcion;
    Map<String, Persona> personas;
    private static int cantActividades;



    public Actividad(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        ++cantActividades;
    }

    public static int getCantActividades() {
        return cantActividades;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Map<String, Persona> getPersonas() {
        return personas;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPersona (Persona persona) {
        personas.put(persona.getCodigo(), persona);
    }

    public Persona getPersona(String codigo) {
        return personas.get(codigo);
    }
    public boolean existePersona (String codigo) {
        return personas.containsKey(codigo);
    }
}
