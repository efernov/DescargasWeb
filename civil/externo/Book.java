package civil.externo;

// ¡¡¡NO SE TOCA!!
public class Book implements Content {
	private String title;
	private String isbn;

	public String getTitle() {
		return title;
	}

	public String getIsbn() {
		return isbn;
	}

	public Book(String title, String isbn) {
		super();
		this.title = title;
		this.isbn = isbn;
	}

}
