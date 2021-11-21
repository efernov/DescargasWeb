package mdef;

public abstract class ObraImp implements Obra {
	private String id;
	private String nombre;

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	public ObraImp(String id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return toText();
	}

}
