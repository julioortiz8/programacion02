package unidad02.ejercicios;

public class Diapositiva08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador = 2;
		
		while (contador <= 50) {
			System.out.println(contador);
			
			// contador = contador + 2;
			contador += 2;
		}
		
		int contador2 = 1;
		
		while (contador2 <= 50) {
			if (contador2 % 2 == 0) {
				System.out.println(contador2);
			}
			
			contador2 ++;
		}

	}

}
