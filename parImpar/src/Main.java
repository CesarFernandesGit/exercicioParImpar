import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Quantos numeros voce vai digitar? ");
		int contagem = scanner.nextInt();

		int numero = 0;
		char par = 0;
		char impar = 0;

		for (int i = 0; i < contagem; i++) {
			System.out.print("Digite um numero: ");
			numero = scanner.nextInt();

			int resto = numero % 2;
			if (resto == 0 && numero > 0) {
				numero = par;
				System.out.println("PAR POSITIVO");
			} else if (resto == 1 && numero > 0) {
				numero = impar;
				System.out.println("IMPAR POSITIVO");
			} else if (resto == 0 && numero < 0) {
				numero = par;
				System.out.println("PAR NEGATIVO");
			} else if (resto < 1 && numero < 0) {
				numero = impar;
				System.out.println("IMPAR NEGATIVO");
			} else if (numero == 0) {
				System.out.println("NULO");
			}

		}

		scanner.close();
	}

}
