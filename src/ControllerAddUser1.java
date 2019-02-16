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
    private TextField textNombre;

   

	public String getTextNombre() {
		return textNombre.getText();
	}

	public void setTextNombre(TextField textNombre) {
		this.textNombre = textNombre;
	}

	@FXML
    private TextField textApellidos;

    @FXML
    private TextField textDni;

    @FXML
    private TextField textCorreoElectronico;

    @FXML
    void exit(ActionEvent event) {

    	General.stageAddUsers1.close();
    	General.stageInicio.show();
    	
   
    }

    @FXML
    void next(ActionEvent event) {
    	General.stageAddUsers1.close();
    	General.stageAddUsers2.show();
    	
    }

}

    	
    


    
