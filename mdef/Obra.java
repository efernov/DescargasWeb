package mdef;

import java.util.Collection;

import civil.externo.Content;

public interface Obra extends Identificable<String>, Nombrable, Content {

	Collection<String> getParticipantes();

	default String getTitulo() {
		return getNombre();
	}

	default String toText() {
		return getClass().getSimpleName() + ": (" + getId() + ") " + getTitulo();
	}
	
	default String getDetalleObra() {
		return toString() + " han participado: " + getParticipantes().size();
	}

}
