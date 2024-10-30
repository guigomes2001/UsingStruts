import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport{

	private String message;
	
	public String execute() {
		message = "Hello World!";
		return SUCCESS;
	}
	
	public String getMessage() {
		return message;
	}
}
