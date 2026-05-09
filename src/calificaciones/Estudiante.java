package calificaciones;
public class Estudiante {
    private String codigo;
    private String nombre;
    private int nota1, nota2, nota3;
    private int notaFinal;

    public Estudiante(String codigo, String nombre, int nota1, int nota2, int nota3) {
        setCodigo(codigo);
        setNombre(nombre);
        setNota1(nota1);
        setNota2(nota2);
        setNota3(nota3);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (null != codigo && !codigo.isEmpty()) {
            this.codigo = codigo;
        } else {
            throw new IllegalArgumentException("El código del estudiante no puede ser nulo");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (null != nombre && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("El nombre del estudiante no puede ser nulo");
        }
    }

    public int getNota1() {
        return nota1;
    }

    private boolean validarNota(int nota) {
        if (nota >= 0 && nota <= 100) {
            return true;
        }

        throw new IllegalArgumentException("La nota debe estar entre 0 e 100");
    }

    public void setNota1(int nota1) {
        this.nota1 = validarNota(nota1) ? nota1 : 0;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = validarNota(nota2) ? nota2 : 0;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = validarNota(nota3) ? nota3 : 0;
    }

    public int getNotaFinal() {
        this.notaFinal = Math.round((nota1 + nota2 + nota3) / 3);
        return notaFinal;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", notaFinal=" + notaFinal +
                '}';
    }
}