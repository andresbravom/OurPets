import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ControllerSuperUser {

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
    	
    	General.stageAutenticationSuperUser.close();
    	General.stageOptionAdmin.show();

    }

    @FXML
    void login(ActionEvent event) {

    	String textUsername = username.getText();
    	String textPassword = password.getText();
    	
    	if(textUsername.equals("1")&& textPassword.equals("qwerty")) {
    		username.clear();
    		password.clear();
    		General.stageAutenticationSuperUser.close();
    		General.stageReadFileGeneral.show();
    	}
    	else {
    		username.clear();
    		password.clear();
    	}
    
    
    }
}