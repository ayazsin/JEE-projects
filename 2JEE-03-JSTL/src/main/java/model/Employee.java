package model;

public class Employee {
	
	private String firstname;
	private String surname;
	private int age;
	
	public Employee(String firstname, String surname, int age) {
		super();
		this.firstname = firstname;
		this.surname = surname;
		this.age = age;
	}
	
	

	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getSurname() {
		return surname;
	}



	public void setSurname(String surname) {
		this.surname = surname;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", surname=" + surname + ", age=" + age + "]";
	}
	
	
	
	
	
	

}
