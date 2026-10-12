import java.util.Scanner;

public class RendimientoAcademico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Promedio: ");
        int promedio = sc.nextInt();

        if (promedio < 11) {
            System.out.println("Desaprobado");
        } else if (promedio <= 14) {
            System.out.println("Regular");
        } else if (promedio <= 17) {
            System.out.println("Bueno");
        } else if (promedio <= 20) {
            System.out.println("Excelente");
        } else {
            System.out.println("Promedio no válido");
        }
    }
}