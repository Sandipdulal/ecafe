package com.edu.ecafe.Service;

import java.util.Collection;

import com.edu.ecafe.Domain.EProductType;
import com.edu.ecafe.Domain.Product;

public interface IProductService {
	public Product saveProduct(String pName,EProductType productType , byte[] pic , double price);
	public boolean deleteProduct(int productId);
	public void UpdareProduct(int productId , String pName,EProductType productType , byte[] pic , double price);
	public Product getProduct(int productId);
	public Collection<Product> getAllProduct();
	
	
}
