package ejercicioclass.enumeracion;

import java.util.Scanner;

public enum estacionesanio {
    PRIMAVERA("verano"),
    VERANO("otoño"),
    OTOÑO("invierno"),
    INVIERNO("primavera");

    private String estacion;
    estacionesanio(String estacion) {
        this.estacion = estacion;
    }
    public String Estacion(){
        return estacion;
    }

}

class TestEstacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("ingrese la estacion: ");
            String verEstacion = sc.nextLine().trim().toUpperCase();
            estacionesanio esd = estacionesanio.valueOf(verEstacion);
            System.out.println("el proximo estacion es: " + esd.Estacion());
        } catch (IllegalArgumentException e) {
            System.out.println("esta estacion q?");
        } finally {
            sc.close();

        }
    }
}
