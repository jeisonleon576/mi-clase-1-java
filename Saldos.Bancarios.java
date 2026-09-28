import java.util.Scanner; 

class Saldos {public static void main(String[] args) {
Scanner e = new Scanner(System.in); 
int a = e.nextInt(), b = e.nextInt(); 
System.out.println(a > b);
System.out.println(a < b);
System.out.println(a >= b);
System.out.println(a <= b);
System.out.println(a == b);
System.out.println(a != b); 
System.out.println(a > b ? "Cuenta 1 mayor saldo" :
a < b ? "Cuenta 2 mayor saldo" :"Iguales"); 
System.out.println("Diferencia: S/ " + Math.abs(a - b));
}