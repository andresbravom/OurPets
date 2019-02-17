import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControllerGeneral  {

    @FXML
    private Button Administradores;

    @FXML
    private Button Usuarios;

    @FXML
    private Button Salir;

    @FXML
    void EnterToAdmins(ActionEvent event) {
    	General.stageInicio.close();
    	General.stageLogin.show();
    }

    @FXML
    void Exit(ActionEvent event) {
    	General.stageInicio.close();
    }

    @FXML
    void LoginUsers(ActionEvent event) {
    	General.stageInicio.close();
    	General.stageAddUsers.show();
    }

}
