package entidades;

import entidades.enums.Cor;

public class Circulo extends Forma {
	// atributo
	private Double raio;

	// m�todo construtor default
	public Circulo() {
		super();
	}

	// sobrecarga do m�todo construtor da classe
	public Circulo(Cor cor, Double raio) {
		super(cor);
		this.raio = raio;
	}

	// sobrescrita do m�todo da superclasse
	@Override
	public Double area() {
		return Math.PI * raio * raio;
	}
}
