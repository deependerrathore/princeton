/*
 * Shortcut for getter setter:- Alt + Shift + S
 */
package orelly.firstproject;


public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private Person mom;
	
	public Person getMom() {
		return mom;
	}
	public void setMom(Person mom) {
		this.mom = mom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
	}
	public void birthday() {
		age++;
	}
	
}
