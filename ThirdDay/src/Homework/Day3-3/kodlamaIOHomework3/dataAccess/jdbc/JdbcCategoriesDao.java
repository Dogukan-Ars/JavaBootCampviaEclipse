package kodlamaIOHomework3.dataAccess.jdbc;

import kodlamaIOHomework3.dataAccess.ICategoriesDao;
import kodlamaIOHomework3.entities.Categories;

public class JdbcCategoriesDao implements ICategoriesDao {

	@Override
	public void add(Categories categories) {
		System.out.println(categories.getCategoryName()+ " Added to Database with Jdbc");
		
	}

	@Override
	public void update(Categories categories) {
		System.out.println(categories.getCategoryName()+ " Updated to Database with Jdbc");
		
	}

	@Override
	public void delete(Categories categories) {
		System.out.println(categories.getCategoryName()+ " Deleted from Database with Jdbc");
		
	}

}
