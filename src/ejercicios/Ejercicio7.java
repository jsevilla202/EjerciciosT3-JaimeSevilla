package ejercicios;

/*
 * Pruebas (valor/es introducidos) : (valor esperado) : (respuestas)
 * 3 : 12321 : 12321
 * 0 : ERROR : ERROR
 * -1 : ERROR : ERROR
 */

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*
		 * Nombramos las variables como numeros enteros:
		 * n: Número introducido por el usuario
		 */
		int n;
		
		//Creamos un scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Presentamos el programa al usuario y su funcionamiento
		System.out.println("A continuación, el programa le va a pedir un número y hará una media prirámide contando hasta el número introducido");
		//Pedimos un número al usuario
		System.out.print("Inserte un número: ");
		//Capturamos la respuesta y la guardamos en la variable "n"
		n = sc.nextInt();
		
		if(n>0) {
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
			 * - Suma 1 a la variable "i" cada vuelta
			 */
			for(int j=1; j<=i; j++) {
				//Mostramos la variable "j" en cada vuelta
				System.out.print(j);
			}
			/*
			 * En el bucle "for":
			 * - Inicializamos la variable "j" a "i"-1 para que no aparezca en la primera línea
			 * - No se parará hasta llegar a "1" ya que es una cuenta regresiva
			 * - Resta 1 a la variable "j" cada vuelta
			 */
			for(int j = i-1; j>=1; j--) {
				System.out.print(j);
			}
			//Muestra un salto de línea
			System.out.println("");
		}
		
		}
		
		else {
			System.out.println(n==0?"ERROR: No se mostrará nada al ser 0":"ERROR: No se admiten valores negativos");
		}
		//Cerramos el scanner
		sc.close();

	}

}
