package entidades;

import entidades.enums.Cor;

public abstract class Forma {

	// atributo
	private Cor cor;

	// M�todo construtor default
	public Forma() {
		super();
	}

	// m�todos - modificadores de acesso - getters e setters
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

	// m�todo abstrato
	public abstract Double area();
}
