import java.util.Scanner;

public class HiLo {
	public static void main(String[] args) {
		/*
		 *Comentarios traducidos al español desde lo expuesto en el libro
		 *Variables cambiadas a mi gusto y al español, cuando crei necesario.
		 * */
		Scanner scanner = new Scanner(System.in);
		String jugarNuevamente;
		do {
			// Crea un numero random para que el usuario adivine.
			int numero = (int) (Math.random() * 500 - 250);
			//System.out.println("numero = " + numero);
			int prediccion = 0;
			int numeroDeIntentos = 0;
			while (prediccion != numero) {
				System.out.println("Adivina un numero entre -250 y 250: ");
				prediccion = scanner.nextInt();
				if (prediccion < numero) {
					System.out.println(prediccion + " es muy bajo. Inténtelo de nuevo.");
					numeroDeIntentos+=1;
				}
				else if (prediccion > numero) {
					System.out.println(prediccion + " es muy alto. Inténtelo de nuevo.");
					numeroDeIntentos+=1;
				}
				else {
					System.out.println(prediccion + " es correcto. ¡Ganaste!");
					System.out.println("El numero de intentos fue de: "+numeroDeIntentos);
				}
			} //Fin del ciclo mientras/while para adivinar
			System.out.println("¿Te gustaría jugar nuevamente (s/n)?");
			jugarNuevamente = scanner.next();
		} while (jugarNuevamente.equalsIgnoreCase("s"));
		System.out.println("¡Gracias por jugar! Adios.");
		scanner.close();
	}
}
