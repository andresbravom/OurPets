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
	static Stage stageAutenticationSuperUser;
	static Stage stageReadFileGeneral;
	static Stage stageReadFileAdoptar;
	static Stage stageReadFileApadrinar;
	static Stage stageReadFilePasear;
	static Stage stageAddUsers1;
	static Stage stageAddUsers2;
	static Stage stageOptionUser;
	
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
			
			stageOptionAdmin = new Stage();
			URL optionAdmin = getClass().getClassLoader().getResource("OpcionesAdmin.fxml");
			Parent rootOptionAdmin = FXMLLoader.load(optionAdmin);
			Scene sceneOptionAdmin = new Scene(rootOptionAdmin);
			stageOptionAdmin.setTitle("optionAdmin");
			stageOptionAdmin.setScene(sceneOptionAdmin);
			
			stageReadFileGeneral = new Stage();
			URL readFileGeneral = getClass().getClassLoader().getResource("ListadoGeneral.fxml");
			Parent rootReadFileGeneral = FXMLLoader.load(readFileGeneral);
			Scene scenereadFileGeneral = new Scene(rootReadFileGeneral);
			stageReadFileGeneral.setTitle("readFileGeneral");
			stageReadFileGeneral.setScene(scenereadFileGeneral);
			
			stageAutenticationSuperUser = new Stage();
			URL autenticationSuperUser = getClass().getClassLoader().getResource("loginSuperUser.fxml");
			Parent rootAutenticationSuperUser = FXMLLoader.load(autenticationSuperUser);
			Scene sceneAutenticationSuperUser = new Scene(rootAutenticationSuperUser);
			stageAutenticationSuperUser.setTitle("autenticationSuperUser");
			stageAutenticationSuperUser.setScene(sceneAutenticationSuperUser);
			
			stageReadFileAdoptar = new Stage();
			URL readFileAdoptar = getClass().getClassLoader().getResource("listAdopt.fxml");
			Parent rooteRadFileAdoptar = FXMLLoader.load(readFileAdoptar);
			Scene sceneReadFileAdoptar = new Scene(rooteRadFileAdoptar);
			stageReadFileAdoptar.setTitle("readFileAdoptar");
			stageReadFileAdoptar.setScene(sceneReadFileAdoptar);
			
			stageReadFileApadrinar = new Stage();
			URL readFileApadrinar = getClass().getClassLoader().getResource("listApadrinar.fxml");
			Parent rootReadFileApadrinar = FXMLLoader.load(readFileApadrinar);
			Scene sceneReadFileApadrinar = new Scene(rootReadFileApadrinar );
			stageReadFileApadrinar.setTitle("readFileApadrinar");
			stageReadFileApadrinar.setScene(sceneReadFileApadrinar);
			
			stageReadFilePasear = new Stage();
			URL readFilePasear = getClass().getClassLoader().getResource("listPasear.fxml");
			Parent rootReadFilePasear = FXMLLoader.load(readFilePasear);
			Scene sceneReadFilePasear = new Scene(rootReadFilePasear);
			stageReadFilePasear.setTitle("readFilePasear");
			stageReadFilePasear.setScene(sceneReadFilePasear);
		
			stageAddUsers1 = new Stage();
			URL addUser1 = getClass().getClassLoader().getResource("RegistroUsuario1.fxml");
			Parent rootAddUser1 = FXMLLoader.load(addUser1);
			Scene sceneAddUser1 = new Scene(rootAddUser1);
			stageAddUsers1.setTitle("addUser1");
			stageAddUsers1.setScene(sceneAddUser1);
			
			stageAddUsers2 = new Stage();
			URL addUsers2 = getClass().getClassLoader().getResource("RegistroUsuario2.fxml");
			Parent rootAddUsers2 = FXMLLoader.load(addUsers2);
			Scene sceneAddUsers2 = new Scene(rootAddUsers2);
			stageAddUsers2.setTitle("addUsers2");
			stageAddUsers2.setScene(sceneAddUsers2);
			
			stageOptionUser = new Stage();
			URL optionUser = getClass().getClassLoader().getResource("OpcionesUsuario.fxml");
			Parent rootOptionUser = FXMLLoader.load(optionUser);
			Scene sceneOptionUser = new Scene(rootOptionUser);
			stageOptionUser.setTitle("optionUser");
			stageOptionUser.setScene(sceneOptionUser);
			
	
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}

	public static void Inicio() {
		launch(null);
	}
}
