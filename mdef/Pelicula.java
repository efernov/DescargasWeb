package mdef;

import java.util.ArrayList;
import java.util.Collection;

public class Pelicula extends ObraImp {
	private Director director;
	private NombrableImpl[] actores;

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public NombrableImpl[] getActores() {
		return actores;
	}

//	public void setActores(NombrableImpl[] actores) {
//		this.actores = actores;
//	}

	public void setActores(NombrableImpl... actores) {
		this.actores = actores;
	}
		
	public Pelicula(String id, String titulo) {
		super(id, titulo);
	}

	@Override
	public Collection<String> getParticipantes() {
		Collection<String> participantes = new ArrayList<String>();
		participantes.add(getDirector().getNombre());
		for (NombrableImpl actor : getActores()) {
//			participantes.add(actor.getNombre());
			participantes.add(actor.toString());
		}
//		for (int i = 0; i < getActores().length; i++) {
//			participantes.add(getActores().toString());
//		}
		return participantes;
	}

}
