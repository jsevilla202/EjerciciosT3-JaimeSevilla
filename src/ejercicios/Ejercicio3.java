package ejercicios;

/*
 * Pruebas (valor/es introducidos) : (valor esperado) : (respuestas)
 * 5 : 5 altura x 5 base : 5 altura x 5 base
 * 
 */

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * Nombramos las variables como numeros enteros:
		 * n: Número introducido por el usuario
		 */
		int n;
		
		//Creamos un scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Presentamos el programa al usuario y lo que se le va a pedir
		System.out.println("A continuación se le pedirá un número y se generará un triangulo con esas dimensiones");
		//Pedimos al usuario un número
		System.out.print("Introduzca un número, por favor: ");
		//Capturamos la respuesta en la variable "n"
		n = sc.nextInt();
		
		//Para resolver este problema, hay que pensar que el triangulo está metido dentro de un cuadrado de altura igual a la variable "n"
		if(n>=1) {
		//Con este primer "for" indicamos la altura del triangulo
		for(int i=1;i<=n;i++) {
			//Este los espacios que hay desde el borde del cuadrado hasta el primer punto del triangulo
			for(int k=i; k<=n; k++) {
				System.out.print(" ");
			}
			//Este los puntos que hay por línea
			for(int k=1; k<=i; k++) {
				System.out.print("* ");
			}
			//Después de poner los espacios y puntos hacemos un salto de línea
			System.out.println("");
		}
		}
		else {
			System.out.println("ERROR: El valor introducido no es positivo");
		}
		//Cerramos el scanner
		sc.close();

	}

}
