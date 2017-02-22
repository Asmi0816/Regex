package regex.controller;

import regex.view.RegexFrame;

public class RegexController 
{
	private RegexFrame baseFrame;
	
	public void start()
	{
		baseFrame = new RegexFrame(this);
	}
}
