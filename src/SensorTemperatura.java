import java.util.Scanner;

public class SensorTemperatura {
    // En esta oportunidad vamos a ver la temperatura en la que trabaja una caldera
    public static void main(String[] args) {
        int response = 6;
        do {
            System.out.println("Indique el rango de temperatura a la cual se encuentra trabajando la caldera pirotubular");
            System.out.println("1. Mayor a 340°C");
            System.out.println("2. 300°C - 340°C");
            System.out.println("3. 250°C - 300°C");
            System.out.println("4. 200°C - 250°C");
            System.out.println("5. 150°C - 200°C");
            System.out.println("6. 95°C - 150°C");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("El caldero hizo BOOM, favor de comprar otro");
                    break;
                case 2:
                    System.out.println("El caldero se encuentra trabajando a altas temperaturas, es probable que los ductos se encuentren obstruidos, se sugirio hacer los mantenimientos de ductos hace medio año");
                    break;
                case 3:
                    System.out.println("El caldero se encuentra trabajando a su maxima potencia");
                    break;
                case 4:
                    System.out.println("El caldero esta trabajando de manera optima");
                    break;
                case 5:
                    System.out.println("El caldero esta con ganas de poder trabajar mucho más");
                    break;
                case 6:
                    System.out.println("El caldero no esta siendo rentable, los costo de mantenimiento son muy altos");
                    break;
                default:
                    System.out.println("Selecciona una opción correcta, no seas inútil");
            }
        } while (response != 1);

        System.out.println("TE PUEDO DAR OPCIONES DE COMPRA" +
                " CASO CONTRARIO DEDICATE A OTRA COSA");
    }
}
