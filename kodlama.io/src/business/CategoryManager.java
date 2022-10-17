package business;

import core.BaseLogger;
import dataAccess.CategoryDao;
import entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private BaseLogger[] loggers;

	public CategoryManager(CategoryDao categoryDao, BaseLogger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {
		Category[] categories = { new Category(1, "Frontend"), new Category(2, "Backend"), new Category(3, "Mobile") };
		for (Category c : categories) {
			if(category.getName()==c.getName()) {
				throw new Exception("Kategori ismi bulunmaktadır, tekrar edemez.");
			}
		}
		categoryDao.add(category);
		for(BaseLogger logger:loggers) {
			logger.log(category.getName());
		}

	}
}
