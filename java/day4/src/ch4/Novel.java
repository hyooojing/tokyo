package ch4;

public class Novel extends Book {
	
	String genre;

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return super.toString() + " 장르는 " + getGenre();
	}

}
