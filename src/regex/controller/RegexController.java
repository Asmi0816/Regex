package regex.controller;
import java.util.regex.*;
import regex.view.RegexFrame;

public class RegexController 
{
	private RegexFrame baseFrame;
	
	public void start()
	{
		baseFrame = new RegexFrame(this);
	}
	
	public boolean firstName(String name)
	{
		return name.matches( "[a-zA-Z]*" );
	}
	
	public boolean lastName(String name)
	{
		return name.matches( "[a-zA-z]+([ '-][a-zA-Z]+)*" );
	}
	
	public boolean email(String email)
	{
		return email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	}
	
	public boolean numberChecker(String number)
	{
		return number.matches("[0-9]+");
	}
}
