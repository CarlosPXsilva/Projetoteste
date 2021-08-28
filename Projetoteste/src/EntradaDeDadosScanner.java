import java.util.Scanner;

public class EntradaDeDadosScanner {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite seu nome:");
		String nome = entrada.nextLine();

		System.out.println("Nome do usuário: " + nome);

		System.out.println("Agora informe sua idade:");
		int idade = entrada.nextInt();
		System.out.println("A idade informada foi: " + idade);

	}

}
