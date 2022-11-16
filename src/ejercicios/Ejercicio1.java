package ejercicios;

/*
 * Pruebas (valor/es introducidos) : (valor esperado) : (respuestas)
 * 10/10/0/3600 : 11/10/0 : 11/10/0
 * -1/10/10/10 : ERROR : ERROR
 * 10/-1/10/10 : ERROR : ERROR
 * 10/10/-1/10 : ERROR : ERROR
 * 10/10/10/-1 : ERROR : ERROR
 * 23/59/59/1 : 0/0/0 : 0/0/0
 * 
 */

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Nombramos las variables como numeros enteros:
		 * hora: Hora introducida por el usuario
		 * min: Minutos introducidos por el usuario
		 * seg: Segundos introducidos por el usuario
		 * plus: Segundos para incrementar introducidos por el usuario
		 */
		int hora, min, seg, plus;
		
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Presentamos el programa al usuario y como funciona
		System.out.println("A continuación el programa le pedirá:\n- Hora\n- Minutos\n- Segundos\n- Segundos a incrementar");

		/*
		 * Pedimos al usuario que inserte el valor para las siguientes variables:
		 * - hora
		 * - min
		 * - seg
		 * - plus
		 * 
		 * Y capturamos la respuesta en las respectivas variables
		 */
		System.out.print("Inserte la hora, por favor: ");
		hora = sc.nextInt();
		System.out.print("Inserte los minutos, por favor: ");
		min = sc.nextInt();
		System.out.print("Inserte los segundos, por favor: ");
		seg = sc.nextInt();
		System.out.print("Inserte los segundos que desea incrementar, por favor: ");
		plus = sc.nextInt();
		
		//Comprobamos que los valores introducidos sean positivos y dentro de los rangos horarios
		if((hora>=0&&hora<=24)&&(min>=0&&min<=59)&&(seg>=0&&seg<=59)&&plus>=0) {
		//Sumamos los segundos de incremento a los segundos introducidos por el usuario
		seg = seg + plus;
		
		/*
		 * Mientras que los segundos sean mayores o iguales a 60:
		 * - Igualamos los minutos a los propios minutos más la división de los segundos entre 60 para obtener los minutos
		 * - Igualamos los segundos al resto de pasarlos a minutos ( dividiendolos entre 60 )
		 */
		while(seg>=60) {
			min = min + (int)seg/60;
			seg = seg%60;
		}
		
		/*
		 * Mientras los minutos sean mayores o iguales a 60:
		 * - Igualamos las horas a las propias horas más la división de los minutos  entre 60 para obtener las horas
		 * - Igualamos los minutos al resto de pasarlos a horas ( dividiendolos entre 60 )
		 */
		while(min>=60) {
			hora = hora + (int)min/60;
			min = min%60;
		}
		
		/*
		 * Mientras las horas sean mayores o iguales a 24:
		 * - Igualamos las horas al resto de dividir las horas entre 24
		 */
		while(hora>=24) {
			hora = hora%24;
		}
		
		//Mostramos el resultado por consola
		System.out.println("La hora es: "+ hora + ":"+min+":"+seg);
		//cerramos el scanner
		sc.close();
		}
		//Si alguno no lo es, mostramos un mensaje de error
		else {
			System.out.println("ERROR: Uno de los valores introducidos no es válido. El tiempo no puede ser negativo");
		}
	}

}
