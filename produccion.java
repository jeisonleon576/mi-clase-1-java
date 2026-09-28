import java.util.Scanner; 

class Produccion {public static void main(String[] args) {
Scanner e = new Scanner(System.in);
int a = e.nextInt(), b = e.nextInt();
System.out.println(a > b);
System.out.println(a < b);
System.out.println(a >= b);
System.out.println(a <= b);
System.out.println(a == b);
System.out.println(a != b); 
System.out.println(a > b ? "Fábrica 1 produjo más" :
a < b ? "Fábrica 2 produjo más" :"Iguales"); 
System.out.println("Diferencia: " + Math.abs(a - b));
}
}