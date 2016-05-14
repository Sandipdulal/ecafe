package com.edu.ecafe.Domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import com.edu.ecafe.Domain.EProductType;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	private String productName;
	@Enumerated(EnumType.STRING)
	private EProductType productType;
	@Lob
	private byte[] pic;
	private double productPrice;
	
	
	public Product(int productId, String productName, EProductType productType, byte[] pic, double productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productType = productType;
		this.pic = pic;
		this.productPrice = productPrice;
	}
	
	public Product(String pName, EProductType productType2, byte[] pic2, double price) {
		// TODO Auto-generated constructor stub
	}

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public EProductType getProductType() {
		return productType;
	}
	public void setProductType(EProductType productType) {
		this.productType = productType;
	}
	public byte[] getPic() {
		return pic;
	}
	public void setPic(byte[] pic) {
		this.pic = pic;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	
}
