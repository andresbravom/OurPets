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
    private Button buttonShowListGeneral;

    @FXML
    void exit(ActionEvent event) {
    	General.stageOptionAdmin.close();
    	General.stageInicio.show();

    }

    @FXML
    void listGeneral(ActionEvent event) {
    	General.stageOptionAdmin.close();
    	General.stageAutenticationSuperUser.show();

    }

    @FXML
    void showListAdopt(ActionEvent event) {
    	General.stageOptionAdmin.close();
    	General.stageReadFileAdoptar.show();

    }

    @FXML
    void showListApadrinar(ActionEvent event) {
    	General.stageOptionAdmin.close();
    	General.stageReadFileApadrinar.show();
    	
    }

    @FXML
    void showListPasear(ActionEvent event) {
    	General.stageOptionAdmin.close();
    	General.stageReadFilePasear.show();
    	
    }

}

