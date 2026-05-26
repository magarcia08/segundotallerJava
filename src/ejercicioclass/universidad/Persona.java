package ejercicioclass.universidad;

abstract public class Persona {

    protected String codigo;
    protected String nombre;
    protected String apellido;
    protected Fecha fechaNac;



    public Persona(String codigo, String nombre, String apellido,
                   int diaNac, int mesNac, int anioNac) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        fechaNac = new Fecha(diaNac,mesNac, anioNac);
    }

    public Persona() {

    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public Fecha getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Fecha fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setFechaNac(int diaNac, int mesNac, int anioNac) {
        if (fechaNac == null){
            fechaNac = new Fecha(diaNac,mesNac,anioNac);
        } else {
            fechaNac.setDia(diaNac);
            fechaNac.setMes(mesNac);
            fechaNac.setAnio(anioNac);
    }
    }

    @Override
    public abstract String toString();


}
