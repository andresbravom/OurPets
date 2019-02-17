import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class ControllerListApadrinar {

    @FXML
    private Button buttonExit;

    @FXML
    private TextArea listApadrinar;

    @FXML
    private Button bottonListApadrinar;

    @FXML
    void exit(ActionEvent event) {
    	listApadrinar.clear();
    	General.stageReadFileApadrinar.close();
    	General.stageOptionAdmin.show();
    }

    @FXML
    void listApadrinar(ActionEvent event) {

    	try {
	        Scanner s = new Scanner(new File("./ApadrinarZona1.txt")).useDelimiter("\r\n");
	        while (s.hasNext()) {
	            if (s.hasNextInt()) { // check if next token is an int
	            	listApadrinar.appendText(s.nextInt() + "\r\n"); // display the found integer
	            } else {
	            	listApadrinar.appendText(s.next() + "\r\n"); // else read the next token
	            }
	        }
	    } catch (FileNotFoundException ex) {
	        System.err.println(ex);
	    }
    }

}