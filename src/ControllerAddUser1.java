import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControllerAddUser1 {

    @FXML
    private Button buttonNext;

    @FXML
    private Button buttonExit;

    @FXML
    private TextField nombre;

    @FXML
    private TextField apellidos;

    @FXML
    private TextField dni;

    @FXML
    private TextField correoElectronico;

    @FXML
    void exit(ActionEvent event) {

    	General.stageAddUsers1.close();
    	General.stageInicio.show();
    }

    @FXML
    void next(ActionEvent event) {

    }

}

