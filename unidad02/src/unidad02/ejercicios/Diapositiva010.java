package unidad02.ejercicios;

import java.util.Scanner;

public class Diapositiva010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un número: ");
        int numero = sc.nextInt();
		while (numero != 0) {
		
			if (numero % 2 == 0) {
				System.out.printf("El número %d es par. \n", numero);
			}
			System.out.println("Introduce un número: ");
			numero = sc.nextInt();
		}
	}
}
		
