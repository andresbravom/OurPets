import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControllerAddUser2 {

    @FXML
    private Button buttonExit;

    @FXML
    private Button buttonNext;

    @FXML
    private TextField textDireccion;

    @FXML
    private TextField textZona;

    @FXML
    private TextField textCuentaBancaria;

    @FXML
    private TextField textTelefono;

    @FXML
    void exit(ActionEvent event) {
    	General.stageAddUsers1.close();
    	General.stageInicio.show();

    }

    @FXML
    void next(ActionEvent event) {
    	General.stageAddUsers2.close();
    	General.stageOptionUser.show();

    }

}