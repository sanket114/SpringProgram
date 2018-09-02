package LookUpMethod;

public class Address {
	int pincode;
	String cityName;
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", cityName=" + cityName + "]";
	}
	public Address(int pincode, String cityName) {
		super();
		this.pincode = pincode;
		this.cityName = cityName;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
