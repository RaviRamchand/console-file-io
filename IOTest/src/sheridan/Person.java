package sheridan;

public class Person {	
	//Fields
	private String _firstName;
	private String _lastName;
	private int _age;
	
	//Methods
	//Constructors
	public Person() {
		this._firstName = "";
		this._lastName = "";
		this._age = 0;
	}
	
	public Person(String firstName, String lastName, int age) {
		this._firstName = firstName; 
		this._lastName = lastName;
		this._age = age;
	}
	
	public String getFirstName() {
		return this._firstName;
	}
	
	public String getLastName() {
		return this._lastName;
	}
	
	public int getAge() {
		return this._age;
	}
	
	@Override
	public String toString() {
		return "First Name: " +getFirstName() +" Last Name: " +getLastName() +" Age: " +getAge();
	}
}
