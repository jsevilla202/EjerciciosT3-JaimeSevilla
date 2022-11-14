package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		int n;
		
		//Creamos un scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Presentamos el programa al usuario y su funcionamiento
		System.out.println("A continuación, el programa le va a pedir un número y hará una media prirámide contando hasta el número introducido");
		//Pedimos un número al usuario
		System.out.print("Inserte un número: ");
		//Capturamos la respuesta y la guardamos en la variable "n"
		n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			for(int j = i-1; j>=1; j--) {
				System.out.print(j);
			}
			System.out.println("");
		}
		
		sc.close();

	}

}
