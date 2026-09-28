import java.util.Scanner;

class Kilometros {public static void main(String[] args) {
Scanner e = new Scanner(System.in); 
int a = e.nextInt(), b = e.nextInt(); 
System.out.println(a > b);
System.out.println(a < b);
System.out.println(a >= b);
System.out.println(a <= b);
System.out.println(a == b);
System.out.println(a != b); 
System.out.println(a > b ? "Conductor 1 recorrió más" :
a < b ? "Conductor 2 recorrió más" :"Iguales");
System.out.println("Diferencia: " + Math.abs(a - b) + " km");
}