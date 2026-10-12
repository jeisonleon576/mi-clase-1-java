import java.util.Scanner;

public class TarifaTaxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kilómetros recorridos: ");
        double km = sc.nextDouble();

        double tarifa;

        if (km <= 3) {
            tarifa = 8;
        } else {
            tarifa = 8 + ((km - 3) * 2.50);
        }

        System.out.println("Tarifa total: S/" + tarifa);
    }
}