import java.util.Scanner;
class Consumo {public static void main(String[] args) {
Scanner e = new Scanner(System.in); 
int a = e.nextInt(), b = e.nextInt(); 
System.out.println(a > b);
System.out.println(a < b);
System.out.println(a >= b);
System.out.println(a <= b);
System.out.println(a == b);
System.out.println(a != b);
System.out.println(a > b ? "Hogar 1 consume más" :
a < b ? "Hogar 2 consume más" :"Iguales");
System.out.println("Diferencia: " + Math.abs(a - b));