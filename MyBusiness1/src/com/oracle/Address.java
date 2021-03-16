package com.oracle;
public class Address {
	int flatNo;
	String streetName;
	String city;
	long zipCode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int flatNo, String streetName, String city, long zipCode) {
		super();
		this.flatNo = flatNo;
		this.streetName = streetName;
		this.city = city;
		this.zipCode = zipCode;
	}
	public int getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getZipCode() {
		return zipCode;
	}
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}



}
