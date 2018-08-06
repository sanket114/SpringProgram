package com.scp.pojo;

public class AddressPojo {
	private int id;
	private String city;
	private String pincode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public AddressPojo(int id, String city, String pincode) {
		super();
		this.id = id;
		this.city = city;
		this.pincode = pincode;
	}
	public AddressPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AddressEntity [id=" + id + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
}
