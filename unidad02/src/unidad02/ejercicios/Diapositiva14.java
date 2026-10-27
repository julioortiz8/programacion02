package unidad02.ejercicios;

import java.util.Scanner;

public class Diapositiva14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
        int numero;
		do {
			System.out.println("Introduce un número del 1 al 10: ");
			numero = sc.nextInt();

	   }
	   while (numero < 1 || numero > 10);
	   System.out.printf("El número introducido no está dentro del rango.");
	}


}
