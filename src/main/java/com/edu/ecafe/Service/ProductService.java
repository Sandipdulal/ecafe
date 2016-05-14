package com.edu.ecafe.Service;

import java.util.Collection;
import com.edu.ecafe.Dao.IProductDAO;
import com.edu.ecafe.Dao.ProductDAO;
import com.edu.ecafe.Domain.EProductType;
import com.edu.ecafe.Domain.Product;
import com.edu.ecafe.Util.ILogger;
import com.edu.ecafe.Util.Logger;

public class ProductService implements IProductService {
	
	private IProductDAO productDAO;
	private ILogger logger;
	
	public ProductService(ProductDAO productDAO , Logger logger ) {
		this.productDAO=productDAO;
		this.logger=logger;
	}

	public Product saveProduct(String pName, EProductType productType, byte[] pic, double price) {
		Product newProduct=new Product(pName, productType, pic, price);
		productDAO.saveProduct(newProduct);
        logger.log("create Product with values ProductNumber= "
               + pName + " , ProductName= " + productType);
        return newProduct;
	}

	public boolean deleteProduct(int productId) {
		return productDAO.deleteProduct(productDAO.getProductById(productId));
	}

	public void UpdareProduct(int productId, String pName, EProductType productType, byte[] pic, double price) {
		Product product=new  Product(pName, productType, pic, price);
		product.setProductId(productId);
		productDAO.updateProduct(product);
        logger.log("Update Product with values ProductNumber= "
                + pName + " , ProductName= " + productType);
	}

	public IProductDAO getProductDAO() {
		return productDAO;
	}

	public void setProductDAO(IProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	public ILogger getLogger() {
		return logger;
	}

	public void setLogger(ILogger logger) {
		this.logger = logger;
	}

	public Product getProduct(int productId) {
		return productDAO.getProductById(productId);
	}

	public Collection<Product> getAllProduct() {
		return productDAO.getAllProduct();
	}

}
