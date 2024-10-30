import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport{

	private String massage;
	
	public String execute() {
		massage = "Hello World!";
		return SUCCESS;
	}
	
	public String getMassage() {
		return massage;
	}
}
