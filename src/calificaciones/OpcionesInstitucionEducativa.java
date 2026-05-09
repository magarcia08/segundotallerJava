package calificaciones;
import java.util.*;

public class OpcionesInstitucionEducativa {
    MenuInstitucionEducativa mnu;
    Map<String, Estudiante> listEstudiante = new HashMap<>();
    Scanner scn;

    public OpcionesInstitucionEducativa(Scanner scn) {
        this.scn = scn;
    }

    public void iniciar() {
        do {
            mnu = new MenuInstitucionEducativa(scn);
            mnu.mostrarMenu();
            int opmnu = mnu.getOpcion();
            switch (opmnu) {
                case 1:
                    ingresarEstudiantes();
                    break;
                case 2:
                    mostrarEstudiantes();
                    break;
                case 3:
                    mostrarTerna();
                    break;
                case 4:
                    // mostrarGrafico();
                    break;
                case 0:
                    System.out.println("\n\nFin del programa\n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (true);
    }

    private void mostrarTerna() {
        System.out.println("\n\n2. Mostrar Terna \n");

        List<Estudiante> lEstudiante = new ArrayList<>(listEstudiante.values());
        lEstudiante.sort(new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante o1, Estudiante o2) {
                return o2.getNotaFinal() - o1.getNotaFinal();
            }
        });

        int longLista = (lEstudiante.size() < 3) ? lEstudiante.size() : 3 ;
        for(int i=0; i<longLista; ++i) {
            System.out.println(lEstudiante.get(i));
        }
    }

    private void mostrarEstudiantes() {
        System.out.println("\n\n2. Mostrar Estudiante \n");

        for(Estudiante e: listEstudiante.values()){
            System.out.println(e);
        }
    }

    private void ingresarEstudiantes() {
        System.out.println("\n\n1. Ingresar Estudiante \n");
        //Scanner scn = new Scanner(System.in);

        do {
            System.out.println("Ingrese el código del estudiante: ");
            String codigo = scn.nextLine();
            System.out.println("Ingrese el nombre del estudiante: ");
            String nombre = scn.nextLine();
            System.out.println("Ingrese el nota1 del estudiante: ");
            int nota1 = scn.nextInt();
            System.out.println("Ingrese el nota2 del estudiante: ");
            int nota2 = scn.nextInt();
            System.out.println("Ingrese el nota3 del estudiante: ");
            int nota3 = scn.nextInt();

            Estudiante e = new Estudiante(codigo, nombre, nota1, nota2, nota3);
            e.getNotaFinal();

            listEstudiante.put(codigo, e);

            System.out.println("\nDesaa continuar (s/N)?: ");
            if (scn.hasNextLine()) scn.nextLine();
            String continuar = scn.nextLine();
            if (continuar.equalsIgnoreCase("N")) break;
        } while (true);

    }
}