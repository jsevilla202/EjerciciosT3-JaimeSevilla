package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int n, i, j;
		String punto = "*";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A continuación se le pedirá un número y se generará un triangulo con esas dimensiones");
		System.out.print("Introduzca un número, por favor: ");
		n = sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
    		for(j=i;j<=n;j++)
    		{
        			System.out.print(" ");
    		}
    		for(j=1;j<=i;j++)
    		{
        			System.out.print("*");
    		}
    		System.out.println("");
		}	

	}

}
