import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ControllerLogin {

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button buttonLogin;

    @FXML
    private Button buttonExit;

    @FXML
    void exit(ActionEvent event) {
    	
    	General.stageLogin.close();
    	General.stageInicio.show();
    }

    @FXML
    void login(ActionEvent event) {

    	String textUsername = username.getText();
    	String textPassword = password.getText();
    	
    	if(Admins.authentication(textUsername, textPassword)) {
    		General.stageLogin.close();
    		General.stageOptionAdmin.show();
    	}
    	else {
    		username.clear();
    		password.clear();
    	}
    }

}