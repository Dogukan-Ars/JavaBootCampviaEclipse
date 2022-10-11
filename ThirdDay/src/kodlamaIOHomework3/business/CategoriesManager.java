package kodlamaIOHomework3.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaIOHomework3.core.logging.ILogger;
import kodlamaIOHomework3.dataAccess.ICategoriesDao;
import kodlamaIOHomework3.entities.Categories;
import kodlamaIOHomework3.entities.Courses;

public class CategoriesManager {
	private ICategoriesDao iCategoriesDao;
	private ILogger[] iLoggers;
	

	public CategoriesManager(ICategoriesDao iCategoriesDao, ILogger[] iLoggers) {
		this.iCategoriesDao = iCategoriesDao;
		this.iLoggers = iLoggers;
	}
	
	List<Categories> category = new ArrayList<>();

	public void add(Categories categories) throws Exception {
		for (Categories ctg : category) {
			if (ctg.getCategoryName().equals(categories.getCategoryName())) {
				throw new Exception("Category name can not use more than ones!!");
			}
		}
			
			
			iCategoriesDao.add(categories);
			category.add(categories);
			
			for (ILogger iLogger : iLoggers) {
			iLogger.log(categories.getCategoryName());
		}			
	}	
	
	public void update(Categories categories) {
		this.iCategoriesDao.update(categories);
		for (ILogger iLogger : iLoggers) {
			iLogger.log(categories.getCategoryName());
		}
	}
	
	public void delete(Categories categories) {
		this.iCategoriesDao.delete(categories);
		for (ILogger iLogger : iLoggers) {
			iLogger.log(categories.getCategoryName());
		}
	}

}
