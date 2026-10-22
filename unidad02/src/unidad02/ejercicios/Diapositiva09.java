package unidad02.ejercicios;

import java.util.Scanner;

public class Diapositiva09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int sumatorio = 0;
		int contador = 0;
		while (contador <10) {
			System.out.printf("Introduce el número %d: \n", contador + 1);
			int numero = sc.nextInt();
			contador++;
			sumatorio = sumatorio + numero;
		}
		double promedio = sumatorio * 1.0 / 10;
		System.out.printf("La suma de los número es %d y el promedio es %.2"
				+ "f.", sumatorio, promedio);

	}

}
