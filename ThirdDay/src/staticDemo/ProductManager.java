package staticDemo;

public class ProductManager {
	public void add(Product product) {
		
		if (ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		}else {
			System.out.println("Ürün bilgileri geçersizdir!!!");
		}
//		ProductValidator productValidator = new ProductValidator(); //Burayı new'lemek productvalidator classındaki yapıcı blok çalıştı ibaresinin çalışmasına sebep olur.
//		productValidator.bisey();
	}
}
