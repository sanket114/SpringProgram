package com.scp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity

public class EmployeeEntity {
	@Id
	private int id;
	private String name;
	private int age;
	@OneToOne(cascade=CascadeType.ALL)
	AddressEntity ad;
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
	public AddressEntity getAd() {
		return ad;
	}
	public void setAd(AddressEntity ad) {
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", age=" + age + ", ad=" + ad + "]";
	}
	public EmployeeEntity(int id, String name, int age, AddressEntity ad) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.ad = ad;
	}
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
