package com.scp.pojo;

public class EmployeePojo {
	private int id;
	private String name;
	private int age;
	AddressPojo addressPojo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public AddressPojo getAd() {
		return addressPojo;
	}
	public void setAd(AddressPojo addressPojo) {
		this.addressPojo = addressPojo;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", age=" + age + ", addressPojo=" + addressPojo + "]";
	}
	public EmployeePojo(int id, String name, int age, AddressPojo ad) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.addressPojo = addressPojo;
	}
	public EmployeePojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
