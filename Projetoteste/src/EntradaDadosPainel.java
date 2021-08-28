import javax.swing.JOptionPane;

public class EntradaDadosPainel {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome");

		int idade = Integer.valueOf(JOptionPane.showInputDialog("Digite sua idade"));

		Double carros = Double.valueOf(JOptionPane.showInputDialog("Qual a quantidade de carros?"));

		vento();

		JOptionPane.showMessageDialog(null,
				"Nome informado " + nome + " idade informada " + idade + " Quantidade de carros informada: " + carros);

		PrimeiraClasseJava();
	}

	public static void vento() {
		JOptionPane.showMessageDialog(null, "Olha o vento");

	}

	public static void PrimeiraClasseJava() {
		String carros = JOptionPane.showInputDialog("Qual a quantidade de carros?");
		String pessoas = JOptionPane.showInputDialog("Qual a quantidade de pessoas");

		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);

		int divisao = (int) (carroNumero / pessoaNumero); /* 4 */

		double resto = carroNumero % pessoaNumero;

		int resposta = JOptionPane.showConfirmDialog(null,"Deseja ver o resultado da divisão?");

		if(resposta==0) {
		
			JOptionPane.showMessageDialog(null, "Divisão para numero de pessoas deu " + divisao);
		}
		resposta = JOptionPane.showConfirmDialog(null,"Deseja ver o resto da divisão?");
		if(resposta==0) {
			JOptionPane.showMessageDialog(null, "O resto da divisão foi: " + resto);
	}
}
}
