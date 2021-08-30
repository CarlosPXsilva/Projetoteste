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
		SegundaClasseJava();
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
	
	public static void SegundaClasseJava() {
		
		String nota1 = JOptionPane.showInputDialog("Informe a nota 1: ");
		String nota2 = JOptionPane.showInputDialog("Informe a nota 2: ");
		String nota3 = JOptionPane.showInputDialog("Informe a nota 3: ");
		String nota4 = JOptionPane.showInputDialog("Informe a nota 4: ");
		
		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);
		
		double media = (dNota1+dNota2+dNota3+dNota4) / 4;
		
		if (media >= 50) {
			if (media >= 70) {
				JOptionPane.showMessageDialog(null, "Aluno está aprovado com media de: " + media);
			}else {
				JOptionPane.showMessageDialog(null, "Aluno em recuperação com media de: " + media);
				
			}
				
			
		} else {
			JOptionPane.showMessageDialog(null, "Aluno está reprovado com média de: " + media);
		}
		JOptionPane.showMessageDialog(null, "A media é: " +  media);
		
	}
}
