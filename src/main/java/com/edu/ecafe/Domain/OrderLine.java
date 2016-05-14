package com.edu.ecafe.Domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class OrderLine {

	@Id
	@GeneratedValue
	private int orderline_id;
	
	private int quantity;
	
	private double sub_total;
	
	@ManyToOne
	@JoinTable(name="order_Id")
	private Order order;
	
	@OneToOne
	private Product product;
	
	

	public OrderLine(int quantity, Order orders, Product product, double sub_total) {
		super();
		this.quantity = quantity;
		this.order = orders;
		this.product = product;
		this.sub_total = sub_total;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Order getOrders() {
		return order;
	}

	public void setOrders(Order orders) {
		this.order = orders;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double getTotal_price() {
		return sub_total;
	}

	public void setTotal_price(double total_price) {
		this.sub_total = total_price;
	}
	
	
	
	
}
