package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
	public void add(Product product) {
		// sadece ve SADECE db erişim kodları buraya yazılır!!! SQL bilmemiz gerek...
		System.out.println("JDBC ile veritabanına eklendi");
	}
}


