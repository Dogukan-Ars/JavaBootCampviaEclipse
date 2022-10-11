package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao; // dependency injection
	private Logger[] loggers;

	public ProductManager(ProductDao productDao, Logger[] loggers) { // ProductManager new'lendiğinde bana bir
																		// productdao ver ve onu ekle...
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception { // response request pattern
		// business rules
		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatı 10'dan küçük olamaz");
		}

		// ProductDao productDao = new JdbcProductDao(); // KURAL : Bir katman başka bir
		// katmanın class'ını kullanıyorken sadece interface'inden erişim kurmalıdır!!!
		productDao.add(product);

		for (Logger logger : loggers) { // [db, mail]
			logger.log(product.getName());
		}
	}
}
