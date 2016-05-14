package com.edu.ecafe.Domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Order {

	@Id
	@GeneratedValue
	private int order_ID;

	@Temporal(TemporalType.DATE)
	private Date date_created;

	@Temporal(TemporalType.DATE)
	private Date date_shipped;
	
	@ManyToMany
	@JoinTable(name="order_product")
	private List<Product> product;

	//private List<Customer> customers;

	/*public Order(Date date_created, Date date_shipped, List<Customer> customer) {
		super();
		this.date_created = date_created;
		this.date_shipped = date_shipped;
		this.customers = customer;
	}*/

	public int getOrder_ID() {
		return order_ID;
	}

	public void setOrder_ID(int order_ID) {
		this.order_ID = order_ID;
	}

	public Date getDate_created() {
		return date_created;
	}

	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}

	public Date getDate_shipped() {
		return date_shipped;
	}

	public void setDate_shipped(Date date_shipped) {
		this.date_shipped = date_shipped;
	}

	/*public List<Customer> getCustomer() {
		return customers;
	}

	public void setCustomer(List<Customer> customer) {
		this.customers = customer;
	}*/

}
