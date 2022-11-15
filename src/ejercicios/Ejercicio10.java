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
		
		//Igualamos n1 a n2 para poder manipular el número sin modificarlo
		n1 = n2;
		
		//No parará hasta que n2 sea 0
		while(n2!=0) {
			//Obtenemos la ultima cifra y le damos el valor a la variable "cifra"
			cifra = n2%10;
			//Igualamos "n2" a "n2"/10
			n2 = n2/10;
			//Igualamos la variable "iverso" a si misma por 10 más la cifra
			inverso = inverso*10 + cifra;
		}
		
		//Si "n1" e "inverso" son iguales, es capicúa
		if(n1 == inverso) {
			System.out.println("Su número es capicúa");
		}
		//Si no, no lo es
		else {
			System.out.println("Su número no es capicúa");
		}
		//cerramos el scanner
		sc.close();
				

	}

}
