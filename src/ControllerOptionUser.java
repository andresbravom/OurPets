import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControllerOptionUser {

    @FXML
    private Button buttonExit;

    @FXML
    private Button buttonRegister;

    @FXML
    private Button buttonAdopt;

    @FXML
    private Button buttonApadrinar;

    @FXML
    private Button buttonPasear;

    @FXML
    void exit(ActionEvent event) {
    	General.stageAddUsers1.close();
    	General.stageInicio.show();

    }

    @FXML
    void register(ActionEvent event) {

    }

    @FXML
    void writeFileAdopt(ActionEvent event) {

    }

    @FXML
    void writeFileApadrinar(ActionEvent event) {

    }

    @FXML
    void writeFilePasear(ActionEvent event) {

    }

}