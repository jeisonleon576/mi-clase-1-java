import java.util.Scanner;

class Edades {public static void main(String[] args) {
Scanner e = new Scanner(System.in);
int a = e.nextInt(), b = e.nextInt(); 
System.out.println(a > b);
System.out.println(a < b);
System.out.println(a >= b);
System.out.println(a <= b);
System.out.println(a == b);
System.out.println(a != b); 
System.out.println(a > b ? "Trabajador 1 es mayor" :
a < b ? "Trabajador 2 es mayor" :
"Iguales"); 
System.out.println("Diferencia: " + Math.abs(a - b));
}
}