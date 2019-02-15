import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class General extends Application{
	static Stage stageInicio;
	static Stage stageLogin;
	
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
	
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}

	public static void Inicio() {
		launch(null);
	}
}
