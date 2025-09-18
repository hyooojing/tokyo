package ch4;

public class ProductMain {

	public static void main(String[] args) {
		
		Product product = new Product();
		
		product.setName("아이폰17프로");
		product.setPrice(1790000);
		System.out.println(product.toString());
	}
	
}
