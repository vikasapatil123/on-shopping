package net.kzn.onshoppinbackend.dao;

import java.util.List;

import net.kzn.onshoppinbackend.dto.Product;

public interface ProductDao {
	Product get(int id);
	List<Product> list();
	boolean add(Product product);
	boolean update(Product product);
	boolean delete(Product product);
	
	//Business methods
	List<Product> listActiveProducts();
	List<Product> listActiveProductsByCategory(int categoryId);
	List<Product> getLatestActiveProducts(int count);
}
