package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		/*
		 * Nombramos las variables como numeros enteros:
		 * a: Número introducido por el usuario
		 * b: Número introducido por el usuario
		 * nmayor: Número mayor entre las variables "a" y "b"
		 * nmenor: Número menor entre las variables "a" y "b"
		 */
		int a, b, nmayor = 0, nmenor = 0, mayor;
		
		//Creamos un scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Presentamos el programa al usuario y lo que se le va a pedir
		System.out.println("A continuación se le va a pedir dos números y el programa va a buscar el máximo común múltiplo de ambos");
		//Pedimos al usuario un número
		System.out.print("Introduzca el primer número: ");
		//Capturamos la respuesta en la variable "a"
		a = sc.nextInt();
		//Pedimos al usuario un número
		System.out.print("Introduzca el segundo número: ");
		//Capturamos la respuesta en la variable "b"
		b = sc.nextInt();
		
		//Si tanto la variable "a" como "b" son positivas, continuamos con el programa
		if(a>=0&&b>=0) {
			/*
			 * Comprobamos si:
			 * b es mayor que a
			 * a es mayor que b
			 * a y b son iguales
			 * 
			 * Para igualar las variables "nmayor" y "nmenor" a cada una
			 */
		if(a<b) {
			nmayor = b;
			nmenor = a;
		}
		else if(a==b) {
			System.out.println("Los números son iguales por lo que el máximo común divisor es "+ a);
		}
		else {
			nmayor = a;
			nmenor = b;
		}
		for(int i = nmayor; i>=nmenor; i--) {
			if(a%i==0&&b%i==0) {
				mayor = i;
				System.out.println("El máximo común divisor de ambos es "+ mayor);
				break;
			}
		}
		}
		//Si no, enviamos un mensaje de error
		else {
			System.out.println("ERROR: Un valor introducido es negativo");
		}
		sc.close();
	}

}
