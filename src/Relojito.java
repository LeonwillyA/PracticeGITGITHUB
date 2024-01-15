public class Relojito {
    public static void main(String[] args) {
        int[][] x;
        x = new int[1][4];

        x[0][0] = 0;
        x[0][1] = 0;
        x[0][2] = 0;
        x[0][3] = 0;

        while (x[0][0]<60 ){
            x[0][0] = x[0][0] + 1;
            System.out.println("Segundos: " + x[0][0]);
            while (x[0][0]==60 && x[0][1]<60){
                x[0][0] = 0;
                x[0][1] = x[0][1] + 1;
                System.out.println("Minutos: " + x[0][1]);
                while (x[0][1]==60 && x[0][2]<24) {
                    x[0][1] = 0;
                    x[0][2] = x[0][2] + 1;
                    System.out.println("Horas: " + x[0][2]);
                    while (x[0][2]==24 && x[0][3]<3){
                        x[0][2] = 0;
                        x[0][3] = x[0][3] + 1;
                        System.out.println("Dias: " + x[0][3]);
                    }
                }
            }

        }
        System.out.println("Es el día: " + x[0][3] + " /Hora: " + x[0][2] + " Minutos: "+ x[0][1] +" Segundos:  " + x[0][0]);





       /* No es relevante para la resolución, pero es como inicie:
       do  {
            x[0][0] = x[0][0] + 1;
            System.out.println("Los segundos son: " + x[0][0]);
            do{
                x[0][0] = 0;
                x[0][1] = x[0][1] + 1;
                System.out.println("Los minutos son: " + x[0][1]);
            }
            while (x[0][1]<60);{
                System.out.println("Ayuda");
            }
        }
        while (x[0][2] < 60);
        {
            x[0][1] = x[0][1] + 1;
            System.out.println("Los minutos son: " + x[0][1]);
            x[0][0] = 0;
        }*/

    }

}
