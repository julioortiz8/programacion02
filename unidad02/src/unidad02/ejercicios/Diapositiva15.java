package unidad02.ejercicios;

import java.util.Scanner;

public class Diapositiva15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String vocal;
		
		do {
			System.out.printf("Introduce una vocal: ");
            vocal = sc.next().toUpperCase();
			
		} while (!vocal.equals("A") && !vocal.equals("E") && !vocal.equals("I") && !vocal.equals("O") && !vocal.equals("U"));
		System.out.printf("La vocal introducida es correcta. ");
	}

}
