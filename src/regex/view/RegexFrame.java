package regex.view;
import regex.controller.RegexController;
import java.awt.Dimension;
import javax.swing.*;
import regex.view.RegexPanel;

public class RegexFrame extends JFrame
{
	private RegexPanel basePanel;
	private RegexController baseController;
	
	public RegexFrame(RegexController baseController)
	{
		super();
		this.baseController = baseController;
		basePanel = new RegexPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("A new thing yay ");
		this.setSize(new Dimension(400, 400));
		this.setVisible(true);
	}
}
