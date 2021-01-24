package entidades;

import entidades.enums.Cor;

public class Circulo extends Forma {
	// atributo
	private Double raio;

	// método construtor default
	public Circulo() {
		super();
	}

	// sobrecarga do método construtor da classe
	public Circulo(Cor cor, Double raio) {
		super(cor);
		this.raio = raio;
	}

	// sobrescrita do método da superclasse
	@Override
	public Double area() {
		return Math.PI * raio * raio;
	}
}
