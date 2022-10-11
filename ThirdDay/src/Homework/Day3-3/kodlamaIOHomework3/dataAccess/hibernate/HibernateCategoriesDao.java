package kodlamaIOHomework3.dataAccess.hibernate;

import kodlamaIOHomework3.dataAccess.ICategoriesDao;
import kodlamaIOHomework3.entities.Categories;

public class HibernateCategoriesDao implements ICategoriesDao {

	@Override
	public void add(Categories categories) {
		System.out.println(categories.getCategoryName()+ " Added to Database with Hibernate");
		
	}

	@Override
	public void update(Categories categories) {
		System.out.println(categories.getCategoryName()+ " Updated to Database with Hibernate");
		
	}

	@Override
	public void delete(Categories categories) {
		System.out.println(categories.getCategoryName()+ " Deleted from Database with Hibernate");
		
	}

}
