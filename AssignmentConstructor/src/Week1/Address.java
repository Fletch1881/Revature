package Week1;

public class Address {
	//and present and permanent Address(aid,streetname,city,state,zip)
	private int aid;
	private String streetName;
	private int zip;
	
	
	public Address(int aid, String streetName, int zip) {
		super();
		this.aid = aid;
		this.streetName = streetName;
		this.zip = zip;
	}


	@Override
	public String toString() {
		return "Address [aid=" + aid + ", streetName=" + streetName + ", zip=" + zip + "]";
	}
	
	
	
	

}
