import java.util.Scanner; 
class Sueldos {public static void main(String[] args) {
Scanner e = new Scanner(System.in);
System.out.print("Ingrese sueldo 1: ");
int s1 = e.nextInt();
System.out.print("Ingrese sueldo 2: ");
int s2 = e.nextInt(); 
System.out.println(s1 + " es mayor que " + s2 + ": " + (s1 > s2));
System.out.println(s1 + " es menor que " + s2 + ": " + (s1 < s2));
System.out.println(s1 + " es mayor o igual que " + s2 + ": " + (s1 >= s2));
System.out.println(s1 + " es menor o igual que " + s2 + ": " + (s1 <= s2));
System.out.println(s1 + " es igual a " + s2 + ": " + (s1 == s2));
System.out.println(s1 + " es diferente de " + s2 + ": " + (s1 != s2)); 
if (s1 > s2)
System.out.println("El practicante 1 gana más.");
else if (s2 > s1)
System.out.println("El practicante 2 gana más.");
else
System.out.println("Ambos ganan igual.");
System.out.println("La diferencia salarial es: S/ " + Math.abs(s1 - s2));