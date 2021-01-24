package aplicação;

//importes das bilio. necessárias
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
	// método main
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);// Método que insere o ponto no lugar da vírgula

		Scanner leitor = new Scanner(System.in);// Leitor da entrada

		List<Forma> formas = new ArrayList<>();// Lista instanciada para armazenar as coleções das formas

		System.out.print("Quantas formas? ");
		int n = leitor.nextInt(); // Recebe a qtd de formas que será criada

		for (int i = 1; i <= n; i++) { // For para percorrer a quantidade de formas informadas
			System.out.println("Forma #" + i);

			System.out.print("Retângulo ou Cículo? (r/c): ");
			char escolha = leitor.next().charAt(0); // Recebe o resultado da forma escolhida do usuário

			System.out.print("Cores disponíveis - (PRETO/AZUL/VERMELHO): ");
			Cor cor = Cor.valueOf(leitor.next()); // Insere a string correspondente a cor da lista enumerada

			if (escolha == 'r' || escolha == 'R') {// Condição pra verificar se a escolha do usuário é o retangulo, se
													// for, entrará e receberá os dados
				System.out.print("Altura: ");
				Double largura = leitor.nextDouble();// recebe a largura
				System.out.print("Largura: ");
				Double altura = leitor.nextDouble();// recebe a altura
				formas.add(new Retangulo(cor, largura, altura)); // cria um retangulo e o insere na lista de coleções
																	// formas
			} else {// caso a escolha do usuário não seja 'r', a condição entrará no else
				System.out.print("Raio: ");
				Double raio = leitor.nextDouble();// recebe o valor do raio
				formas.add(new Circulo(cor, raio));// cria o ciruculo e o armazena dentro da lista de coleções formas
			} // fim da condição if
		} // fim do for
		System.out.println();// pula uma linha
		System.out.println("Formas - Áreas:");
		for (Forma f : formas) {// For each que percorrerá toda a lista de coleções formas
			System.out.println(String.format("%.2f", f.area())); // imprimirá o resultado do retorno do método área de
																	// cada forma da lista de coleções formas
		}
		leitor.close();// encerra o leitor de entrada de dados
	}
}