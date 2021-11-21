package mdef;

import java.util.Collection;

import civil.externo.Book;

public class Libro extends Book implements Obra {

	@Override
	public String getId() {
		return getIsbn();
	}

	@Override
	public String getTitulo() {
		return getTitle();
	}

	public Libro(String id, String titulo) {
		super(titulo, id);
	}

	@Override
	public String toString() {
		return toText();
	}

	@Override
	public Collection<String> getParticipantes() {
		
		return null;
	}
	
}
