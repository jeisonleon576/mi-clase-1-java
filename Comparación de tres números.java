import java.util.Scanner;

public class ComparacionTresNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número 1: ");
        int a = sc.nextInt();

        System.out.print("Número 2: ");
        int b = sc.nextInt();

        System.out.print("Número 3: ");
        int c = sc.nextInt();

        int mayor = a;
        int menor = a;

        if (b > mayor) mayor = b;
        if (c > mayor) mayor = c;

        if (b < menor) menor = b;
        if (c < menor) menor = c;

        int diferencia = mayor - menor;

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Diferencia: " + diferencia);
    }
}