import java.util.Scanner;

class Asistencia {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int a = e.nextInt(), b = e.nextInt();
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out
                .println(a > b ? "Estudiante 1 mejor asistencia" : a < b ? "Estudiante 2 mejor asistencia" : "Iguales");
        System.out.println("Diferencia: " + Math.abs(a - b) + "%");
    }
}