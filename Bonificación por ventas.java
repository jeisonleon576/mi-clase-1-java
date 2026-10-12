import java.util.Scanner;

public class BonificacionVentas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Monto vendido: ");
        double venta = sc.nextDouble();

        double bono;

        if (venta > 5000) {
            bono = venta * 0.10;
        } else {
            bono = venta * 0.05;
        }

        System.out.println("Bonificación: S/" + bono);
        System.out.println("Total: S/" + (venta + bono));
    }
}