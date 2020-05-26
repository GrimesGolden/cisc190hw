import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class IncrementDecrementController {

    @FXML
    private Button incButton;

    @FXML
    private Button decButton;

    @FXML
    private TextField displayField;

    public void incButtonListener()
    {	
    	// Get users input as a string.
    	String str = displayField.getText();

    	// Convert to integer, then increase by 1.
    	int incStr = Integer.parseInt(str) + 1;

    	// Convert back string, in order to display again. 
    	String displayStr = Integer.valueOf(incStr).toString();

    	displayField.setText(displayStr);
    }

    public void decButtonListener()
    {	
    	String str = displayField.getText();

    	int decStr = Integer.parseInt(str) - 1;

    	String displayStr = Integer.valueOf(decStr).toString();

    	displayField.setText(displayStr);
    }

}