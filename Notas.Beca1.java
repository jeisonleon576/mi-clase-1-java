import java.util.Scanner; 
class Beca {public static void main(String[] args) {
Scanner e = new Scanner(System.in;
int a = e.nextInt(), b = e.nextInt();
System.out.println(a > b);
System.out.println(a < b);
System.out.println(a >= b);
System.out.println(a <= b);
System.out.println(a == b);
System.out.println(a != b);
System.out.println(a > b ? "Estudiante 1 obtiene la beca" :
a < b ? "Estudiante 2 obtiene la beca" :"Empate");