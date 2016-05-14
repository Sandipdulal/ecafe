package com.edu.ecafe.Dao;

import java.util.Collection;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.edu.ecafe.Domain.Product;

@Transactional
public class ProductADOHibernate implements IProductDAO {

	private SessionFactory sf;
	
	public ProductADOHibernate(SessionFactory sf) {
		this.sf = sf;
	}
	
	public void saveProduct(Product product) {
		sf.getCurrentSession().persist(product);
	}

	public boolean updateProduct(Product product) {
		try{
			sf.getCurrentSession().saveOrUpdate(product);
		}
		catch (Exception ex){
			System.out.println("Error in update " + ex.getMessage());
			return false;
		}
		return true;
	}

	public boolean deleteProduct(Product product) {
		sf.getCurrentSession().delete(product);
		return false;
	}

	public Product getProductById(int id) {
		SQLQuery sql= sf.getCurrentSession().createSQLQuery("select a from Product where productId= :id a order by productId");
		sql.setParameter(0, id);
		return (Product) sql.uniqueResult();
	}
	
	public Product getProductByName(int name) {
		return (Product) sf.getCurrentSession().createQuery("select a from Product a order by productId " );
	}
	
	@SuppressWarnings("unchecked")
	public Collection<Product> getAllProduct() {
		return sf.getCurrentSession().createQuery("select a from Product a order by productId " ).list();
	}
	
	public SessionFactory getSf() {
		return sf;
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

}
