package ejercicios;

/*
 * Pruebas (valor/es introducidos) : (valor esperado) : (respuestas)
 * 155 : 3 dígitos : 3 dígitos
 * 2555 : 4 dígitos : 4 dígitos
 * 684684 : 6 dígitos : 6 dígitos
 * -1 : ERROR : ERROR
 */

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*
		 * Nombramos las variables como numeros enteros:
		 * n: Número introducido por el usuario. Se inicializa a 1
		 * i: Comprobador de dígitos
		 * j: Contador de dígitos
		 */
		int n, i, j;
		
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Presentamos el programa al usuario
		System.out.println("A continuación, el programa calculará cuantos dígitos tiene el número introducido. Para salir del programa introduzca 0");
		
		do {
			//Pedimos al usuario que introduzca un número
			System.out.print("Introduzca un número: ");
			//Capturamos la respuesta y la guardamos en la variable "n"
			n = sc.nextInt();
			
			//Si el número no es 0
			if(n!=0&&n>0) {
				/*
				 * En el bucle "for":
				 * - Inicializamos la variable "i" a 1
				 * - Inicializamos la variable "j" a 0
				 * - Hasta que el resto del número entre "i" sea 0
				 * - Suma 1 a la variable "j" cada vuelta
				 * - Multiplica i por 10 para añadir 1 dígito
				 */
			for(i = 1, j = 0; i<=n;j++, i*=10) {
			}
			//Mostramos el resultado
			System.out.println("El número tiene "+j+" dígitos");
			}
			
			else if(n<0) {
				System.out.println("ERROR: No se admiten números negativos");
			}
		}
		//No parará hasta que el número introducido sea 0
		while(n!=0);
		//cerramos el scanner
		sc.close();
	}

}
