import java.util.Scanner;

class Promedios {
public static void main(String[] args) {
Scanner e = new Scanner(System.in); 
int a = e.nextInt(), b = e.nextInt(); 
System.out.println(a > b);
System.out.println(a < b);
System.out.println(a >= b);
System.out.println(a <= b);
System.out.println(a == b);
System.out.println(a != b);
System.out.println(a > b ? "Gana estudiante 1" :
a < b ? "Gana estudiante 2" :"Empate");
System.out.println(Math.abs(a - b));
}
}