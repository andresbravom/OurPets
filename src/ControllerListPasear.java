import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class ControllerListPasear {

    @FXML
    private Button buttonExit;

    @FXML
    private TextArea listPasear;

    @FXML
    private Button bottonListPasear;

    @FXML
    void exit(ActionEvent event) {

    	listPasear.clear();
    	General.stageReadFilePasear.close();
    	General.stageOptionAdmin.show();
    }

    @FXML
    void listPasear(ActionEvent event) {

    	try {
	        Scanner s = new Scanner(new File("./PasearZona1.txt")).useDelimiter("\r\n");
	        while (s.hasNext()) {
	            if (s.hasNextInt()) { // check if next token is an int
	            	listPasear.appendText(s.nextInt() + "\r\n"); // display the found integer
	            } else {
	            	listPasear.appendText(s.next() + "\r\n"); // else read the next token
	            }
	        }
	    } catch (FileNotFoundException ex) {
	        System.err.println(ex);
	    }
    }

}
