package calificaciones;

import java.util.Scanner;

public class mainInstitucionEducativa {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        OpcionesInstitucionEducativa ie = new OpcionesInstitucionEducativa(scn);

        ie.iniciar();
        scn.close();
    }
}