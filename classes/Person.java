package classes;

public class Person {

	private String name;
	
	public String getName() {return name;}
	public void setName(String name) {this.name=name;}
	
	public Person() {
		
	}
	
	@Override
	public String toString() {
		return "Name: " + name;
	}
}
