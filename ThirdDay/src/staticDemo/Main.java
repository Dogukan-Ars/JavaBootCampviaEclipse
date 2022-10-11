package staticDemo;

public class Main { // bir class'ı static yapmak demek, ilk kullanıcıdan sonraki gelen her kullanıcının aynı static ifadeyi kullanmasına sebep olur.

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.name = "Mouse";
		product.price = 10;
		
		manager.add(product);
		
		DatabaseHelper.Connection.createConnection();
	}

}
