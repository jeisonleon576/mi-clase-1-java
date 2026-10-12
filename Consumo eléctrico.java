import java.util.Scanner;

public class ConsumoElectrico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Consumo en kWh: ");
        double consumo = sc.nextDouble();

        double costo;

        if (consumo <= 100) {
            costo = consumo * 0.80;
        } else {
            costo = consumo * 1.20;
        }

        System.out.println("Monto a pagar: S/" + costo);
    }
}