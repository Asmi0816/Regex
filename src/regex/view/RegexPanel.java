package regex.view;
import regex.controller.RegexController;
import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;

public class RegexPanel extends JPanel
{
	private RegexController baseController;
	private SpringLayout baseLayout;
	private JButton onlyButton;
	private JTextField firstName;
	private JTextField lastName;
	private JTextField email;
	private JTextField number;
	private JLabel firstLabel;
	private JLabel lastLabel;
	private JLabel emailLabel;
	private JLabel numberLabel;
	
	public RegexPanel(RegexController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.onlyButton = new JButton("A button");
		this.firstName = new JTextField(20);
		this.lastName = new JTextField(20);
		this.email = new JTextField(20);
		this.number = new JTextField(20);
		this.firstLabel = new JLabel("First Name");
		baseLayout.putConstraint(SpringLayout.NORTH, firstLabel, 5, SpringLayout.NORTH, firstName);
		baseLayout.putConstraint(SpringLayout.EAST, firstLabel, 0, SpringLayout.EAST, onlyButton);
		this.lastLabel = new JLabel("Last Name");
		baseLayout.putConstraint(SpringLayout.NORTH, lastLabel, 5, SpringLayout.NORTH, lastName);
		baseLayout.putConstraint(SpringLayout.EAST, lastLabel, 0, SpringLayout.EAST, onlyButton);
		this.emailLabel = new JLabel("Email");
		baseLayout.putConstraint(SpringLayout.NORTH, emailLabel, 5, SpringLayout.NORTH, email);
		baseLayout.putConstraint(SpringLayout.EAST, emailLabel, 0, SpringLayout.EAST, onlyButton);
		this.numberLabel = new JLabel("Phone number");
		baseLayout.putConstraint(SpringLayout.NORTH, numberLabel, 5, SpringLayout.NORTH, number);
		baseLayout.putConstraint(SpringLayout.EAST, numberLabel, 0, SpringLayout.EAST, onlyButton);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.DARK_GRAY);
		this.add(onlyButton);
		this.add(firstName);
		this.add(lastName);
		this.add(email);
		this.add(number);
		this.add(firstLabel);
		this.add(lastLabel);
		this.add(emailLabel);
		this.add(numberLabel);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, onlyButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, onlyButton, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstName, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, email, 6, SpringLayout.SOUTH, lastName);
		baseLayout.putConstraint(SpringLayout.NORTH, number, 6, SpringLayout.SOUTH, email);
		baseLayout.putConstraint(SpringLayout.WEST, number, 0, SpringLayout.WEST, firstName);
		baseLayout.putConstraint(SpringLayout.WEST, email, 0, SpringLayout.WEST, firstName);
		baseLayout.putConstraint(SpringLayout.NORTH, lastName, 64, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstName, -6, SpringLayout.NORTH, lastName);
		baseLayout.putConstraint(SpringLayout.WEST, lastName, 0, SpringLayout.WEST, firstName);
	}
	
	private void setupListeners()
	{
		
	}
}
