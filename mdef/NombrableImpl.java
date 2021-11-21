package mdef;

public class NombrableImpl implements Nombrable, Identificable<Integer> {

	private String nombre;
	private Integer id;

	@Override
	public String getNombre() {
		return nombre;
	}


	@Override
	public Integer getId() {
		return id;
	}
	
	public NombrableImpl() {
		super();
	}

	public NombrableImpl(Integer id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "(" + getId() + ") " + getNombre();
	}
}