package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		/*
		 * Nombramos las variables como numeros enteros:
		 * a: Número introducido por el usuario
		 * b: Número introducido por el usuario
		 * mayor: Número mayor entre las variables "a" y "b"
		 * menor: Número menor entre las variables "a" y "b"
		 */
		int a, b, mayor = 0, menor = 0;
		
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
		
		
		if(a>=0&&b>=0) {
		if(a<b) {
			mayor = b;
			menor = a;
		}
		else if(a==b) {
			System.out.println("Los números son iguales por lo que el máximo común divisor es "+ a);
		}
		else {
			mayor = a;
			menor = b;
		}
		for(int i = mayor; i>=menor; i--) {
			if(a%i==0&&b%i==0) {
				System.out.println("El máximo común divisor de ambos es "+ i);
				break;
			}
		}
		}
		else {
			System.out.println("ERROR: Un valor introducido es negativo");
		}
		sc.close();
	}

}
