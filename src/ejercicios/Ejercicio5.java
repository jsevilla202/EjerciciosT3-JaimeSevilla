package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 * Nombramos las variables como numeros enteros:
		 * a: Número introducido por el usuario
		 * b: Número introducido por el usuario
		 * nmayor: Número mayor entre las variables "a" y "b"
		 * nmenor: Número menor entre las variables "a" y "b"
		 */
		int a, b, nmayor = 0, nmenor = 0, mayor = 0;
		
		//Creamos un scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Presentamos el programa al usuario y lo que se le va a pedir
		System.out.println("A continuación se le va a pedir dos números y el programa va a buscar el mínimo común múltiplo de ambos");
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
		else {
			nmayor = a;
			nmenor = b;
		}
		/*
		 * En el bucle "for":
		 * - Inicializamos la variable "i" a la variable "nmayor" y la nombramos como número entero
		 * - No se parará hasta llegar a "nmenor", nunca va a llegar
		 * - Suma 1 a la variable "i" cada vuelta
		 */
		for(int i = nmayor; i>=nmenor; i++) {
			//Si al dividir "i" entre "nmayor" da "nmenor" y viceversa, ese será el primer mínimo común múltiplo
			if(i/nmayor==nmenor&&i/nmenor==nmayor) {
			mayor = i;
			System.out.println("El mínimo común múltiplo de ambos es "+ mayor);
			break;
			}
		}
		//Si la variable "mayor" sigue con sun valor por defecto significa que no había máximo común divisor de esos números                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
		}
		//Si no, enviamos un mensaje de error
		else {
			System.out.println("ERROR: Un valor introducido es negativo");
		}
		//Cerramos el scanner
		sc.close();

	}

}
