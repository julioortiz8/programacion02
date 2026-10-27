package unidad02.ejercicios;

import java.util.Scanner;

public class Diapositiva17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
		
		int sumatorio = 0;
		int contador = 0;
		int numero = 0;
		do {
			System.out.printf("Introduce el número %d: \n", contador + 1);
			numero = sc.nextInt();
			contador++;
			sumatorio = sumatorio + numero;
		}while (contador <10);
		
		double promedio = sumatorio * 1.0 / 10;
		System.out.printf("La suma de los número es %d y el promedio es %d. ", sumatorio, numero);
	
	}

}
