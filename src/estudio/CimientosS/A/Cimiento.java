package estudio.CimientosS.A;

public class Cimiento {
    public static void main(String[] args) {

        final int HORA_NORMAL = 48;

        String nombreTrabajador = "Juan Esteban Mora";
        int cedula = 1098765432;
        double valorHoraNormal = 12_500;
        int horaTrabajadaSemanal = 50;

        // calculos

        double calculoHoraNormal = valorHoraNormal * horaTrabajadaSemanal;
        double calculoHoraExtra = HORA_NORMAL - horaTrabajadaSemanal;


    }
}
