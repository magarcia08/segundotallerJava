package ejercicioclass.enumeracion;

import java.util.Scanner;

public enum DiaSemana {
    LUNES(true),
    MARTES(true),
    MIERCOLES(true),
    JUEVES(true),
    VIERNES(true),
    SABADO(true),
    DOMINGO(false);

    private boolean eslaborable;
    DiaSemana(boolean eslaborable) {
        this.eslaborable = eslaborable;
    }
    public boolean esLaborable (){
        return eslaborable;
    }
}

class TestDiaSemana {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        try {
            System.out.println("ingrese el dia de la semana: ");
            String dia = sc.nextLine().trim().toUpperCase();
            DiaSemana ds = DiaSemana.valueOf(dia);
            System.out.println("este dia" + (ds.esLaborable() ? "no se sale temprano" : "se sale temprano"));
        } catch (Exception e) {
            System.out.println(" ese dia mo existe");

        } finally {
            sc.close();
        }
        sc.close();
    }
}
