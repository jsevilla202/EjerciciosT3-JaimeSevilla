package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int n;
		boolean primo = true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A continuación se le va a pedir un número y se le mostrará los números primos que hay entre ese número y el 1");
		System.out.print("Introduzca un número, por favor: ");
		n = sc.nextInt();
		
		for(int i=1; i!=n; i++) {
			for (int k = 2; k < i; k++) {
				// Si el número es divisible por i deja de ser primo
				if (i % k == 0) {
					primo = false;
					System.out.println(i);
					break;
				}
			}
		}
	}

}
