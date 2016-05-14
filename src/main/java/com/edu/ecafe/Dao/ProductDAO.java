package com.edu.ecafe.Dao;

import java.util.ArrayList;
import java.util.Collection;

import com.edu.ecafe.Dao.IProductDAO;
import com.edu.ecafe.Domain.Product;

// this class for test dealing with product
public class ProductDAO implements IProductDAO {
	Collection<Product> productList = new ArrayList<Product>();

	public ProductDAO() {

	}

	public void saveProduct(Product product) {
		productList.add(product);

	}

	public boolean updateProduct(Product product) {
		if (getProductById(product.getProductId()) != null) {
			productList.remove(product);
			productList.add(product);
			return true;
		}
		return false;
	}

	public boolean deleteProduct(Product product) {
		if (getProductById(product.getProductId()) != null) {
			productList.remove(product);
			return true;
		}
		return false;
	}

	public Product getProductById(int id) {
		for (Product prod : productList) {
			if (prod.getProductId() == id)
				return prod;
		}
		return null;
	}

	public Product getProductByName(int name) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Product> getAllProduct() {
		return productList;
	}

}
