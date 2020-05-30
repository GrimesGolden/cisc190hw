import javax.swing.*; // Imports java swing capability for JFrame etc..
import java.awt.event.*; // Imports event handling.

public class IncDec extends JFrame
{
	private JPanel panel; // Creates a panel variable.
	private JTextField textField; // Creates a text field variable
	private JButton incButton; // Creates a reference variable to a JButton object.
	private JButton decButton; // Creates a reference variable to a JButton object.
	private final int WINDOW_WIDTH = 400; // Final int for width
	private final int WINDOW_HEIGHT = 100; //Final width for height. 

	public IncDec()
	// Constructor for the IncDec class, a child of the JFrame class. A JFrame object.
	{
		setTitle("Increment Decrement"); // Sets the title.

		setSize(WINDOW_WIDTH, WINDOW_HEIGHT); // Sets size using instance variables.

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Sets a default exit on close.

		buildPanel(); // Utilize the buildPanel()

		add(panel); // Add built JPanel object panel to the JFrame

		setVisible(true); // It should be visible. 
		
	}

	private void buildPanel()
	{
		textField = new JTextField(10); // Create a small text field.
		incButton = new JButton("Increment"); // Create a button labeled increment
		decButton = new JButton("Decrement"); // Create a button labeled decrement. 
		textField.setText("1"); // Add the text "1" to the text field. So it starts off at 1.

		// Add action listeners to buttons.
		incButton.addActionListener(new IncButtonListener()); // Add an action listener to the incButton
		decButton.addActionListener(new DecButtonListener()); // Add an action listener to the decButton

		panel = new JPanel(); // Panel now references a new JPanel object.

		panel.add(incButton); // Add incButton to the panel.
		panel.add(textField); // Add text field to the panel.
		panel.add(decButton); // Add decButton to the panel.
	}

	
	private class IncButtonListener implements ActionListener
	// IncButtonListener is action listener class for the increment button.
	// Utilizes the ActionListener interface, therefore it must contain the actionPerformed method, which takes an ActionEvent parameter. 
	{
		
		public void actionPerformed(ActionEvent e)
		// actionPerformed() executes when the user clicks on increment button.
		{	
			try
			{
				// Obtain current text field data as a string.
    			String str = textField.getText();

    			// Convert to integer, then increase by 1.
    			int incStr = Integer.parseInt(str) + 1;

    			// Convert back string, in order to display again. 
    			String displayStr = Integer.valueOf(incStr).toString();

    			textField.setText(displayStr);
			}
			catch(NumberFormatException i)
			// Will catch a number format exception, in this case the exception being the text field data was null (nothing there).
			{
				textField.setText("enter a number please");
			}
			
		}
	}

	
	private class DecButtonListener implements ActionListener
	// decButtonListener is same as above, only for dec button.
	{
		public void actionPerformed(ActionEvent e)
		{	
			try
			{
				// Get text field info as a string.
    			String str = textField.getText();

    			// Convert to integer, then increase by 1.
    			int decStr = Integer.parseInt(str) - 1;

    			// Convert back string, in order to display again. 
    			String displayStr = Integer.valueOf(decStr).toString();

    			textField.setText(displayStr);
			}
			catch (NumberFormatException i)
			// Same reasoning as above.
			{
				textField.setText("enter a number please");
			}
		}
			
	}

	public static void main(String[] args)
	// Main method is static to this whole JFrame class.
	// That means all we do is create a new IncDec object and presto...
	// It builds and displays the GUI as seen in the constructor. 
	{
		new IncDec();
	}

}