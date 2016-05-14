package com.edu.ecafe.Domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class OrderDetails {

	@Id
	@GeneratedValue
	private int details_id;
	
	private int quantity;
	
	@OneToMany
	private List<Order> orders;
	
	@OneToOne
	private Product product;
	
	private double total_price;

	public OrderDetails(int quantity, List<Order> orders, Product product, double total_price) {
		super();
		this.quantity = quantity;
		this.orders = orders;
		this.product = product;
		this.total_price = total_price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}
	
	
	
	
}
