public class ManejoFuncionesA {
    public static void main(String[] args) {
        //Variables de la temperatura del liquido que recircula
        double tInputL = 90.0;
        double tOutputL = 30.5;
        //Variables de la temperatura del agua
        double tInputH = 15.2;
        double  tOutputH = 45.3;
        double flujoH = 300.18;

        //Lo que al final mostramos es el flujo del liquido
        double flujoL = flujoLiquido (tInputL, tOutputL, tInputH, tOutputH, flujoH);
        System.out.println(flujoL);
    }

    //En esta oportunidad voy a realizar una operación para poder calcular
    // del flujo de agua que va tener
    //Condiciones: Se asume similares la capacidad calorifica del agua y del liquido.
    public static double flujoLiquido (double a, double b, double c, double  d, double e){
        return (d-c)*e/(a-b);

    }
}
