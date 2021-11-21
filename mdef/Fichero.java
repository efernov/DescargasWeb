package mdef;

public class Fichero {
	private float tamano;
	private Obra obra;

	public Obra getObra() {
		return obra;
	}

	public float getTamano() {
		return tamano;
	}

	public Fichero(float tamano, Obra obra) {
		super();
		this.tamano = tamano;
		this.obra = obra;
	}

	@Override
	public String toString() {
		return getObra() + " [" + getTamano() + "MB]";
	}
}
