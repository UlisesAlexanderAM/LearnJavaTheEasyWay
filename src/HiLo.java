import java.util.Scanner;

public class HiLo {
	public static void main(String[] args) {
		/*
		 *Comentarios traducidos al español desde lo expuesto en el libro
		 *Variables cambiadas a mi gusto y al español, cuando crei necesario.
		 * */
		Scanner scanner = new Scanner(System.in);
		// Crea un numero random para que el usuario adivine.
		int numero = (int)(Math.random() * 100 + 1);
		//System.out.println("numero = " + numero);
		int prediccion=0;
		while (prediccion != numero) {
			System.out.println("Adivina un numero entre 1 y 100: ");
			prediccion = scanner.nextInt();
			if (prediccion < numero)
				System.out.println(prediccion + " es muy bajo. Inténtelo de nuevo.");
			else if (prediccion > numero)
				System.out.println(prediccion + " es muy alto. Inténtelo de nuevo.");
			else
				System.out.println(prediccion + " es correcto. ¡Ganaste!");
		}
	}
}
