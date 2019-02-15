import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class ControllerListGeneral {

    @FXML
    private Button buttonExit;

    @FXML
    private TextArea listGeneral;

    @FXML
    private Button bottonListGeneral;

    @FXML
    void exit(ActionEvent event) {

    }

    @FXML
    void listGeneral(ActionEvent event) {
    	
    	
    	    try {
    	        Scanner s = new Scanner(new File("./Usuarios.txt")).useDelimiter("\r\n");
    	        while (s.hasNext()) {
    	            if (s.hasNextInt()) { // check if next token is an int
    	            	listGeneral.appendText(s.nextInt() + "\r\n"); // display the found integer
    	            } else {
    	            	listGeneral.appendText(s.next() + "\r\n"); // else read the next token
    	            }
    	        }
    	    } catch (FileNotFoundException ex) {
    	        System.err.println(ex);
    	    }
    	}
          
    }
    
    
    

               

  



