public class AguaEnSolidos {
    public static void main(String[] args) {
        double x = 1.049;


          if (x>0 && x<0.032) {
              System.out.println(
                      "El valor de la humedad relativa de la hoja del tabajo es: " + x * 33 / 32);
          }
          else if (x>=0.032 && x<0.050) {
              System.out.println(
                      "El valor de la humedad relativa de la hoja del tabajo es: " + x * 33 / 18);
          }
            else {
              System.out.println("Me falta infor");
          }
        }

    }





