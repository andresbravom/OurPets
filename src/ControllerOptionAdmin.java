import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControllerOptionAdmin {

    @FXML
    private Button buttonExit;

    @FXML
    private Button bottonAdoptar;

    @FXML
    private Button bottonApadrinar;

    @FXML
    private Button bottonPasear;

    @FXML
    void exit(ActionEvent event) {

    }

    @FXML
    void showListAdopt(ActionEvent event) {
    	
    	General.stageOptionAdmin.close();
    	General.stageReadFileGeneral.show();
    	
    }

    

    @FXML
    void showListApadrinar(ActionEvent event) {

    }

    @FXML
    void showListPasear(ActionEvent event) {

    }

}
