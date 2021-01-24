package aplica��o;

//importes das bilio. necess�rias
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
//importes das classes
import entidades.Circulo;
import entidades.Forma;
import entidades.Retangulo;
import entidades.enums.Cor;

public class ProgramaForma {
	// m�todo main
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);// M�todo que insere o ponto no lugar da v�rgula

		Scanner leitor = new Scanner(System.in);// Leitor da entrada

		List<Forma> formas = new ArrayList<>();// Lista instanciada para armazenar as cole��es das formas

		System.out.print("Quantas formas? ");
		int n = leitor.nextInt(); // Recebe a qtd de formas que ser� criada

		for (int i = 1; i <= n; i++) { // For para percorrer a quantidade de formas informadas
			System.out.println("Forma #" + i);

			System.out.print("Ret�ngulo ou C�culo? (r/c): ");
			char escolha = leitor.next().charAt(0); // Recebe o resultado da forma escolhida do usu�rio

			System.out.print("Cores dispon�veis - (PRETO/AZUL/VERMELHO): ");
			Cor cor = Cor.valueOf(leitor.next()); // Insere a string correspondente a cor da lista enumerada

			if (escolha == 'r' || escolha == 'R') {// Condi��o pra verificar se a escolha do usu�rio � o retangulo, se
													// for, entrar� e receber� os dados
				System.out.print("Altura: ");
				Double largura = leitor.nextDouble();// recebe a largura
				System.out.print("Largura: ");
				Double altura = leitor.nextDouble();// recebe a altura
				formas.add(new Retangulo(cor, largura, altura)); // cria um retangulo e o insere na lista de cole��es
																	// formas
			} else {// caso a escolha do usu�rio n�o seja 'r', a condi��o entrar� no else
				System.out.print("Raio: ");
				Double raio = leitor.nextDouble();// recebe o valor do raio
				formas.add(new Circulo(cor, raio));// cria o ciruculo e o armazena dentro da lista de cole��es formas
			} // fim da condi��o if
		} // fim do for
		System.out.println();// pula uma linha
		System.out.println("Formas - �reas:");
		for (Forma f : formas) {// For each que percorrer� toda a lista de cole��es formas
			System.out.println(String.format("%.2f", f.area())); // imprimir� o resultado do retorno do m�todo �rea de
																	// cada forma da lista de cole��es formas
		}
		leitor.close();// encerra o leitor de entrada de dados
	}
}