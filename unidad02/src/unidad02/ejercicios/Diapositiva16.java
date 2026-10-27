package unidad02.ejercicios;

import java.util.Scanner;

public class Diapositiva16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero1;
		int numero2;
		
		do {
			System.out.println("Introduce el primer número: ");
            numero1 = sc.nextInt();
            
            System.out.println("Introduce el segundo número: ");
            numero2 = sc.nextInt();
			
		} while (numero1 != numero2);
		System.out.printf("Los números son iguales. Fin del bucle. ");

	}

}
