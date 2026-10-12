import java.util.Scanner;

public class PrestamoBancario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese sueldo: ");
        double sueldo = sc.nextDouble();

        double prestamo;

        if (sueldo >= 3000) {
            prestamo = sueldo * 5;
        } else {
            prestamo = sueldo * 2;
        }

        System.out.println("Préstamo máximo: S/" + prestamo);
    }
}