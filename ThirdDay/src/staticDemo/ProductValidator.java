package staticDemo;

public class ProductValidator {
	static { // C# ile javanın farkı, static ibaresi yazılmazsa javada yapıcı blok çalışmaz, ancak c#'ta her türlü yazılır.
		System.out.println("Static yapıcı block çalıştı"); 
	}
	
	public ProductValidator() {
		System.out.println("Yapıcı block çalıştı");
	}
	public static boolean isValid(Product product) {
		if (product.price>0&&!product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	public void bisey() {
		
	}
	
	public static class BaskaBirClass{ //inner class / inner class'lar kullanılmaması gereken bir tekniktir. Best practice'lere ters düştüğü için SOLID prensibini uygulamamızı engeller...
		public static void sil() {
			
		}
	}
}
