package net.kzn.onshoppinbackend.dao;

import java.util.List;

import net.kzn.onshoppinbackend.dto.Category;

public interface CategoryDao {
	
List<Category> list();
Category get(int id);
boolean add(Category category);
boolean update(Category category);
boolean delete(Category category);


}
