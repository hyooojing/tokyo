package ch4;

public class BookMain {

	public static void main(String[] args) {
		
		TextBook tb = new TextBook();
		tb.setAuthor("김아무개");
		tb.setPrice(38000);
		tb.setTitle("전공서적");
		tb.setSubject("컴퓨터");
		
		Novel nv = new Novel();
		nv.setAuthor("이아무개");
		nv.setGenre("공포");
		nv.setPrice(27800);
		nv.setTitle("소설책");
		
		System.out.println(tb.toString());
		System.out.println("=================");
		System.out.println(nv.toString());
	}

}
