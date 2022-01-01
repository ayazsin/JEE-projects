package model;

public class Person {
	

	private String firstname;
	private String lastname;
	private int age;
	private PersonCat personCat;
	
	
	public Person(String firstname, String lastname, int age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		setPersonCat();
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public PersonCat getPersonCat() {
		return personCat;
	}


	public void setPersonCat() {
		 if (this.age < 20) {
	            this.personCat = PersonCat.JEUNE;
	        } else if (age < 60) {
	        	this.personCat = PersonCat.ADULTE;
	        } else {
	        	this.personCat = PersonCat.SENIOR;
	        }
	}


	
	public Person() {
		super();
	}


	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", personCat=" + personCat
				+ "]";
	}
	
	
	
	
	
	
	

}
