package ch1;

public class InstagramPost {
	String writer;
	String contents;
	
	public InstagramPost(String writer, String contents) {
		super();
		this.writer = writer;
		this.contents = contents;
	}
	
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}

}
