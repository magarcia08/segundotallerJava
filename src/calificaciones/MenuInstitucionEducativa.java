package calificaciones;

import java.util.Scanner;

public class MenuInstitucionEducativa {
    private int opcion;
    Scanner scn;

    public MenuInstitucionEducativa(Scanner scn) {
        this.scn = scn;
    }

    private boolean esEnteroValido(String texto){
        if (texto == null || texto.isBlank()) {
            return false;
        }

        try {
            Integer.parseInt(texto);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void mostrarMenu() {
        String sOpcion;

        do {
            System.out.print("""
                    MENU
                    1. Ingresar estudiantes
                    2. Listar estudiantes
                    3. Mostrar terna
                    4. Mostrar gráfico
                    0. Salir
                    
                    >>> Ingrese su opcion [0, 4]: 
                    """);
            sOpcion = scn.nextLine();
            opcion = (esEnteroValido(sOpcion)) ? Integer.parseInt(sOpcion) : -1;
        } while(opcion < 0 || opcion > 4);

    }

    public int getOpcion() {
        return opcion;
    }
}