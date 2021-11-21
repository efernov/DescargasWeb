package mdef;

import java.util.ArrayList;
import java.util.Collection;

public class Musica extends ObraImp {
	
	private Interprete interprete;
	private Musico[] musicos;
	
	public Musico[] getMusicos() {
		return musicos;
	}

	public void setMusicos(Musico[] musicos) {
		this.musicos = musicos;
	}
	
	public Interprete getInterprete() {
		return interprete;
	}

	public void setInterprete(Interprete interprete) {
		this.interprete = interprete;
	}

	public Musica(String id, String titulo) {
		super(id, titulo);
	}
	
	@Override
	public Collection<String> getparticipantes() {
		Collection<String> participantes = new ArrayList<String>();
		participantes.add(getInterprete().toString());
		//participantes.add(getMusicos().toString());
		return participantes;
	}


	
}
