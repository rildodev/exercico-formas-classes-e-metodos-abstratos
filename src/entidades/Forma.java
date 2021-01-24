package entidades;

import entidades.enums.Cor;

public abstract class Forma {

	// atributo
	private Cor cor;

	// Método construtor default
	public Forma() {
		super();
	}

	// métodos - modificadores de acesso - getters e setters
	public Forma(Cor cor) {
		super();
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	// método abstrato
	public abstract Double area();
}
