package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int n1, inverso = 0, cifra, n2 = 0;
		
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
				
		//Presentamos el programa al usuario
		System.out.println("A continuación, el programa le pedirá un número y comprobará si es capicua o no");
		//Pedimos al usuario un número
		System.out.print("Introduzca un número: ");
		//Capturamos la respuesta y la guardamos en la variable "n"
		n1 = sc.nextInt();
		
		n1 = n2;
		
		while(n2!=0) {
			cifra = n2%10;
			n2 = n2/10;
			inverso = inverso*10 + cifra;
		}
		
		if(n1 == inverso) {
			System.out.println("Su número es capicua");
		}
		else {
			System.out.println("Su número no es capicua");
		}
		
		sc.close();
				

	}

}
