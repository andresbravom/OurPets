import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class General extends Application{
	static Stage stageInicio;
	static Stage stageLogin;
	static Stage stageOptionAdmin;
	static Stage stageAddUsers1;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		try {
			
			stageInicio = new Stage();
			URL  inicio = getClass().getClassLoader().getResource("OurPetsInicio.fxml");
			Parent rootInicio = FXMLLoader.load(inicio);
			Scene sceneInicio = new Scene(rootInicio);
			stageInicio.setTitle("Inicio");
			stageInicio.setScene(sceneInicio);
			stageInicio.show();
			
			stageLogin = new Stage();
			URL  login = getClass().getClassLoader().getResource("Login.fxml");
			Parent rootLogin = FXMLLoader.load(login);
			Scene sceneLogin = new Scene(rootLogin);
			stageLogin.setTitle("Login");
			stageLogin.setScene(sceneLogin);
			
			stageAddUsers1 = new Stage();
			URL addUser1 = getClass().getClassLoader().getResource("RegistroUsuario1.fxml");
			Parent rootAddUser1 = FXMLLoader.load(addUser1);
			Scene sceneAddUser1 = new Scene(rootAddUser1);
			stageAddUsers1.setTitle("addUser1");
			stageAddUsers1.setScene(sceneAddUser1);
			
			stageOptionAdmin = new Stage();
			URL optionAdmin = getClass().getClassLoader().getResource("ListadoUsuarios.fxml");
			Parent rootOptionAdmin = FXMLLoader.load(optionAdmin);
			Scene sceneOptionAdmin = new Scene(rootOptionAdmin);
			stageOptionAdmin.setTitle("optionAdmin");
			stageOptionAdmin.setScene(sceneOptionAdmin);
	
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}

	public static void Inicio() {
		launch(null);
	}
}
