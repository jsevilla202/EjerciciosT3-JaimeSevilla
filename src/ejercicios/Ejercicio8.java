package ejercicios;

/*
 * Pruebas (valor/es introducidos) : (valor esperado) : (respuestas)
 * 10/15/0 : 2/0 : 2/0
 * 10/10/5/0 : 3/1 : 3/1
 * -1 : ERROR : ERROR
 * 10/-1/0 : 2/1 : 2/1
 */

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		/*
		 * Nombramos las variables como numeros enteros:
		 * n: Número introducido por el usuario. Se inicializa a 1
		 * anterior: Anterior valor de n. Se inicializa a 1
		 * i: Contador de fallos
		 * j: Contador de números introducidos
		 */
		int n = 1, anterior = 1, i, j; 
		
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Presentamos el programa al usuario
		System.out.println("A continuación, el programa le pedirá un número y debe introducir números mayores a ese. para salir del programa introduzca 0");
		//Pedimos un número al usuario
		System.out.print("Dime un número inicial: ");
		//Capturamos la respuesta y la guardamos en la variable "anterior"
		anterior = sc.nextInt();
		
		//Comprobamos que el número introducido sea positivo
		if(anterior>0) {
			
			/*
			 * En el bucle "for":
			 * - Inicializamos la variable "i" a 0
			 * - Inicializamos la variable "j" a 0
			 * - Bucle infinito
			 * - Suma 1 a la variable "j" cada vuelta
			 */
		for(i = 0, j = 0; true; j++) {
			//Pedimos un número al usuario
			System.out.print("Dime un número: ");
			//Capturamos la respuesta y la guardamos en la variable "n"
			n = sc.nextInt();
			
			//Si el número es mayor al anterior
			if(n>anterior) {
				//El anterior pasa a ser el nuevo
				anterior = n;
			}
			//Si el número es 0, salimos del búcle
			else if(n==0||anterior==0) {
				break;
			}
			//En otro casó, habrá fallado
			else{
				//Se le muestra que ha fallado
				System.out.println("Fallo es menor.");
				//Reiniciamos el valor de "anterior"
				anterior = 1;
				//Sumamos 1 al contador de fallos
				i++;
			}
		}
		//Mostramos los resultados
		System.out.println("Total de números introducidos: "+ (j+1));
		System.out.println("Números fallados: "+ i);
		}
		//Si el número es negativo o 0
		else {
			//Mostramos un mensaje de error o de cerrando el programa
			System.out.println(anterior==0?"Cerrando el programa":"ERROR: No introduzca números negativos o 0");
		}
	}
}
