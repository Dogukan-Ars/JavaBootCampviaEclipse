package kodlamaIOHomework3.dataAccess;

import kodlamaIOHomework3.entities.Categories;

public interface ICategoriesDao {
	void add(Categories categories);
	void update(Categories categories);
	void delete(Categories categories);
}
