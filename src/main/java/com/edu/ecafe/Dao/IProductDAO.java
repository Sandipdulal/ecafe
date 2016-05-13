package com.edu.ecafe.Dao;

import java.util.Collection;

import com.edu.ecafe.Domain.Product;

public interface IProductDAO {
	
	public void saveProduct(Product product);
	public boolean updateProduct(Product product);
	public boolean deleteProduct(Product product);
	public Product getProductById(int id);
	public Product getProductByName(int name);
	public Collection<Product> getAllProduct();
	
}
