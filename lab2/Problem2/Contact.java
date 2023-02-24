package Problem2;

import java.util.Objects;

public class Contact {
	int id;
	String firstName;
	String phoneNumber;
	
	Contact(int id, String firstName, String phoneNumber){
		this.id=id;
		this.firstName=firstName;
		this.phoneNumber=phoneNumber;
	}
	
	public boolean equals(Object o) {
		if(this==o) return true;
		if(o==null || this.getClass()!=o.getClass()) return false;
		Contact c = (Contact) o;
		return id==c.id && this.firstName.equals(c.firstName);
	}
	
	public int hashCode() {
		return Objects.hash(id);
	}
	
	public String toString() {
		return "Contact: " + 
				" id: " + this.id + ", name = " + this.firstName + ", phoneNumber = " + phoneNumber;	
		}
}
