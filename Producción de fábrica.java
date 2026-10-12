import java.util.Scanner;

public class ProduccionFabrica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de piezas: ");
        int piezas = sc.nextInt();

        double producido = piezas * 5;
        double incentivo;

        if (piezas > 100) {
            incentivo = producido * 0.15;
        } else {
            incentivo = producido * 0.08;
        }

        double total = producido + incentivo;

        System.out.println("Producción: S/" + producido);
        System.out.println("Incentivo: S/" + incentivo);
        System.out.println("Total a recibir: S/" + total);
    }
}