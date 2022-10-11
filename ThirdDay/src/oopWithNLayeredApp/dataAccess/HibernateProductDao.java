package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product) {
		// sadece ve SADECE db erişim kodları buraya yazılır!!! SQL bilmemiz gerek...
		System.out.println("Hibernate ile veritabanına eklendi");
	}
}
