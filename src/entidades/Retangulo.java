package entidades;

import entidades.enums.Cor;

public class Retangulo extends Forma {
	// atributos
	private Double largura;
	private Double altura;

	// metodo construtor default
	public Retangulo() {
		super();
	}

	// Sobrecarga do m�todo construtor
	public Retangulo(Cor cor, Double altura, Double largura) {
		super(cor);
		this.altura = altura;
		this.largura = largura;
	}

	// Sobrescrita do m�todo da superclasse
	@Override
	public Double area() {
		return altura * largura;
	}
}
