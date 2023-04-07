package practicecode;

import java.util.List;
import java.io.Serializable;

public class Person {
	
	//implements Serializable   this class is needed when making the class serializable
	//private static final long serialVersionUID = -3438823399834806194L;
	
	private String name;
	
	private String phoneNumber;

	private List <Person> phoneBook;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Person() {
		
	}

	public Person(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String toString() {
		return name + " " + phoneNumber;
	}
	
}
	
	
	



	
	
