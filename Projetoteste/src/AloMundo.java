
public class AloMundo {
	public static void main(String[] args) {
		int nota1 = 70;
		int nota2 = 70;
		int nota3 = 70;
		int nota4 = 70;
		int media;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/* SWITCH CASE: OPERAÇÕES EXATAS */
		int dia = 1;
		switch (dia) {
		case 1:
			System.out.println("domingo");
			break;

		case 2:
			System.out.println("Segunda-feira");
			break;
		default:
			System.out.println("Outro dia " + dia);
			break;
		}

	}
}
