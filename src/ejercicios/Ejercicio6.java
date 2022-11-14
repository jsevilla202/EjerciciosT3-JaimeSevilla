package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int n;
		
		//Creamos un scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Presentamos el programa al usuario y su funcionamiento
		System.out.println("A continuación, el programa le va a pedir un número de 1 al 20 y hará una media prirámide contando hasta el número introducido");
		//Pedimos un número al usuario
		System.out.print("Inserte un número del 1 al 20: ");
		//Capturamos la respuesta y la guardamos en la variable "n"
		n = sc.nextInt();
		//Comprobamos que el número esté dentro del rango establecido
		if(n<=20&&n>0) {
			
			/*
			 * En el bucle "for":
			 * - Inicializamos la variable "i" a 1
			 * - No se parará hasta llegar a "n"
			 * - Suma 1 a la variable "i" cada vuelta
			 */
		for(int i=1;i<=n;i++) {
			/*
			 * En el bucle "for":
			 * - Inicializamos la variable "j" a 1
			 * - No se parará hasta llegar a "i"
			 * - Suma 1 a la variable "j" cada vuelta
			 * - Muestra la variable "i" "j" veces
			 */
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			//Salto de línea después de cada número
			System.out.println("");
		}
		}
		//Si no está dentro del rango muestra un mensaje de error
		else {
			System.out.println("ERROR:El valor introducido no está en el rango");
		}
		//Cerramos el scanner
		sc.close();

	}

}
