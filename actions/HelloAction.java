package actions;

import com.opensymphony.xwork2.ActionSupport;

import classes.Person;

public class HelloAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private Person personBean;
	
	public Person getPersonBean() {return personBean;}
	public void setPersonBean(Person personBean) {this.personBean=personBean;}
	
	public String execute() {
		
		if(personBean.getName() == null || !personBean.getName().matches("^[A-Za-z ]+$")) {
			addFieldError("name", "Only letters");
			return INPUT;
		} else {
			return SUCCESS;
		}
	}
	
}
