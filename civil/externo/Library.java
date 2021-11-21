package civil.externo;

import java.util.ArrayList;
import java.util.Collection;

public class Library {

	private Collection<Content> books = new ArrayList<Content>();
	
	public Collection<Content> getContents() {
		return books;
	}
	
	public void addContent(Content content) {
		getContents().add(content);
	}
}
