import java.util.Scanner; 
class Ventas {
public static void main(String[] args) {
Scanner e = new Scanner(System.in);
System.out.print("Ingrese ventas del vendedor 1: ");
int v1 = e.nextInt(); 
System.out.print("Ingrese ventas del vendedor 2: ");
int v2 = e.nextInt(); 
System.out.println(v1 + " es mayor que " + v2 + ": " + (v1 > v2));
System.out.println(v1 + " es menor que " + v2 + ": " + (v1 < v2));
System.out.println(v1 + " es mayor o igual que " + v2 + ": " + (v1 >= v2));
System.out.println(v1 + " es menor o igual que " + v2 + ": " + (v1 <= v2));
System.out.println(v1 + " es igual a " + v2 + ": " + (v1 == v2));
System.out.println(v1 + " es diferente de " + v2 + ": " + (v1 != v2)); 
if (v1 > v2)
System.out.println("El vendedor 1 realizó más ventas.");
else if (v2 > v1)
System.out.println("El vendedor 2 realizó más ventas.");
else
System.out.println("Ambos realizaron las mismas ventas.");
System.out.println("La diferencia es: S/ " + Math.abs(v1 - v2));
