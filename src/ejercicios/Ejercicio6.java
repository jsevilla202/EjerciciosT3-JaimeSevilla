package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int n;
		
		//Creamos un scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A continuación, el programa le va a pedir un número de 1 al 20 y hará una media prirámide contando hasta el número introducido");
		System.out.print("Inserte un número del 1 al 20: ");
		n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		
		sc.close();

	}

}
