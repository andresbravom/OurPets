import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class ControllerListAdopt {

    @FXML
    private Button buttonExit;

    @FXML
    private TextArea listAdopt;

    @FXML
    private Button bottonListAdopt;

    @FXML
    void exit(ActionEvent event) {
    	listAdopt.clear();
    	General.stageReadFileAdoptar.close();
    	General.stageOptionAdmin.show();
    }

    @FXML
    void listAdopt(ActionEvent event) {
    	try {
	        Scanner s = new Scanner(new File("./AdoptarZona1.txt")).useDelimiter("\r\n");
	        while (s.hasNext()) {
	            if (s.hasNextInt()) { // check if next token is an int
	            	listAdopt.appendText(s.nextInt() + "\r\n"); // display the found integer
	            } else {
	            	listAdopt.appendText(s.next() + "\r\n"); // else read the next token
	            }
	        }
	    } catch (FileNotFoundException ex) {
	        System.err.println(ex);
	    }
    	
    }

}