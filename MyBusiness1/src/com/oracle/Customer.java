package com.oracle;

import java.util.List;

public class Customer {
	String customerName;
	Address address;
	List<Product> products;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerName, Address address, List<Product> products) {
		super();
		this.customerName = customerName;
		this.address = address;
		this.products = products;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
}
