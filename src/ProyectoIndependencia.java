public class ProyectoIndependencia {
    public static void main(String[] args) {
        String [] [] equipos = new String[9][4];

        equipos [0] [0] = "Proyecto Independencia";
        equipos [1] [0] = "Proyecto Independencia";
        equipos [2] [0] = "Proyecto Independencia";
        equipos [3] [0] = "Proyecto Independencia";
        equipos [4] [0] = "Proyecto Independencia";
        equipos [5] [0] = "Proyecto Independencia";
        equipos [6] [0] = "Proyecto Independencia";
        equipos [7] [0] = "Proyecto Independencia";
        equipos [8] [0] = "Proyecto Independencia";
        equipos [0] [1] = "Etapa III de instalación";
        equipos [1] [1] = "Etapa III de instalación";
        equipos [2] [1] = "Etapa III de instalación";
        equipos [3] [1] = "Etapa II de instalación";
        equipos [4] [1] = "Etapa II de instalación";
        equipos [5] [1] = "Etapa I de instalación";
        equipos [6] [1] = "Etapa I de instalación";
        equipos [7] [1] = "Etapa I de instalación";
        equipos [8] [1] = "Etapa I de instalación";
        equipos [0] [2] = "Electrolizador";
        equipos [1] [2] = "Electrolizador";
        equipos [2] [2] = "Tanques";
        equipos [3] [2] = "Chillers";
        equipos [4] [2] = "Calderos";
        equipos [5] [2] = "Torre de Enfriamiento";
        equipos [6] [2] = "Bombas";
        equipos [7] [2] = "Bombas";
        equipos [8] [2] = "Compresor";
        equipos [0] [3] = "Anodo";
        equipos [1] [3] = "Catodo";
        equipos [2] [3] = "Recubrimiento epoxico";
        equipos [3] [3] = "Agua de enfriamiento";
        equipos [4] [3] = "Gas Natural";
        equipos [5] [3] = "Agua desmineralizada";
        equipos [6] [3] = "Tuberias";
        equipos [7] [3] = "Fluidos";
        equipos [8] [3] = "Aire";


        //Forma N° 1 de imprimir todos los datos
        for (int i = 0; i <= equipos.length-1; i++) {
            for (int j = 0; j < equipos[i].length; j++) {
                System.out.println(equipos [i] [j]);
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();


        //Forma N° 2 de imprimir todos los datos
        for (String [] pair : equipos) {
            for ( String equipo : pair) {
                System.out.println(equipo);
                
            }
        }
        System.out.println();

        System.out.println( equipos [3] [2]);
        System.out.println(equipos [7] [0]);
        
    }
}
