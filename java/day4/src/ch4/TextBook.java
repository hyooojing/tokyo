package ch4;

public class TextBook extends Book {

	String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return super.toString() + " 과목은 " + getSubject();
	}
	
}
