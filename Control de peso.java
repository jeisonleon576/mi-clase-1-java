import java.util.Scanner;

public class ControlPeso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Peso: ");
        double peso = sc.nextDouble();

        if (peso <= 50) {
            System.out.println("Peso aceptado");
        } else {
            System.out.println("Exceso de peso: " + (peso - 50) + " kg");
        }
    }
}