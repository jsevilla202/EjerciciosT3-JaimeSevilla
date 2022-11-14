package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * Nombramos las variables como numeros enteros:
		 * n: Número introducido por el usuario
		 * c: Contador de números primos en el rango
		 * k: Contador para contar desde 2, ya que el 0 y el 1 no cuentan, hasta el número introducido
		 */
		int n, c=0, k = 2;
		/*
		 * Nombramos la variable como booleano:
		 * primo: Indica si el número es primo o no
		 */
		boolean primo;
		
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Presentamos el programa al usuario y su funcionalidad
		System.out.println("A continuación se le va a pedir un número y se le mostrará los números primos que hay entre ese número y el 1");
		//Pedimos al usuario que inserte un número
		System.out.print("Introduzca un número, por favor: ");
		//Capturamos la respuesta en la variable "n"
		n = sc.nextInt();
		
		//Comprobamos que el número insertado esté dentro de los parámetros
		if(n>1) {
			//Usamos "while" para que se repita hasta que el contador "k" llegue a "n"
		while(k<=n) {
			//Nombramos a primo como true, por que si no se hace dentro de este búcle, no funciona correctamente
			primo = true;
			/*
			 * En el bucle "for":
			 * - Inicializamos la variable "i" a 2 ya que 0 y 1 no los contamos
			 * - Nos sirve para quitarlos los números múltiplos de 2 y 3:
			 * 		Cuando "k" sea igual a 4, se cumplirá la condición, entrará dentro del "if" y será marcado como noprimo
			 * 		Es decir, sirve para quitar los números pares a partir del 2 y 3
			 * 		En el caso del 9, se cumple la condición, pero de primeras no entra en el "if" debido a que 9%2!=0, por eso a "i" se le suma 1 y ya se cumple la condición del "if"
			 * - Suma 1 a la variable "i" cada vuelta
			 */
			for(int i = 2; i <= k/2; i++) {
				//Si el resto de la variable "k" entre "i" es 0, el número no es primo y cerramos el bucle con break
				if(k%i==0) {
					primo = false;
					break;
				}
			}
				//Si el número es primo y no es ni 0 ni 1, sumamos 1 a la variable "c"
				if(primo&&k!=0&&k!=1) {
					c++;
				}
			//Sumamos 1 al contador K
			k++;
		}
		//Mostramos el resultado
		System.out.println("Hay un total de "+c+" números primos");
		}
		//Si ha introducido un valor inferior a 1, muestra un mensaje de error
		else {
			System.out.println("ERROR: El valor no puede ser 1 o inferior");
		}
		//cerramos el scanner
		sc.close();
		
	}

}
