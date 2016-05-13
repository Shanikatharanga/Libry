
public class Book {
	
	private int isbn;
	private String author;
	private Title title;
	private Chapter chapters;
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Title getTitle() {
		return title;
	}
	public void setTitle(Title title) {
		this.title = title;
	}
	public Chapter getChapters() {
		return chapters;
	}
	public void setChapters(Chapter chapters) {
		this.chapters = chapters;
	}
}
