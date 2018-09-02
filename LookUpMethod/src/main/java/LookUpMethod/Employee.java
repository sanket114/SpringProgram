package LookUpMethod;

public abstract class Employee {
int id;
String name;
Address ad;
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
public abstract Address getAd() ;
	
public void setAd(String ad) {
	Address ad1=getAd();
	
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, Address ad) {
	super();
	this.id = id;
	this.name = name;
	this.ad = ad;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", ad=" + ad + "]";
}

}
