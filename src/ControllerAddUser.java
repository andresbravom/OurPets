import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControllerAddUser {

    @FXML
    private Button buttonExit;

    @FXML
    private TextField textNombre;

    @FXML
    private TextField textApellidos;

    @FXML
    private TextField textDni;

    @FXML
    private TextField textCorreoElectronico;

    @FXML
    private TextField textDireccion;

    @FXML
    private TextField textZona;

    @FXML
    private TextField textCuentaBancaria;

    @FXML
    private TextField textTelefono;

    @FXML
    private Button buttonAdopt;

    @FXML
    private Button buttonApadrinar;

    @FXML
    private Button buttonPasear;

    @FXML
    void exit(ActionEvent event) {
    	textNombre.clear();
    	textApellidos.clear();
    	textDni.clear();
    	textCorreoElectronico.clear();
    	textDireccion.clear();
    	textZona.clear();
    	textCuentaBancaria.clear();
    	textTelefono.clear();
    	General.stageAddUsers.close();
    	General.stageInicio.show();

    }

    @FXML
    void writeFileAdopt(ActionEvent event) {

     	 try (BufferedWriter bw = new BufferedWriter(new FileWriter("AdoptarZona1.txt", true))) {

 	        bw.write("Nombre: " + textNombre.getText());
 	        bw.newLine();
 	        bw.write("Apellidos: " + textApellidos.getText());
 	        bw.newLine();
 	        bw.write("Correo: " + textCorreoElectronico.getText());
 	        bw.newLine();
 	        bw.write("Telefono: " + textTelefono.getText());
 	        bw.newLine();
 	        bw.write("----------------");
 	        bw.newLine();
 	    } catch (IOException e) {
 	        e.printStackTrace();
 	    }
     	 
    	 try (BufferedWriter bw = new BufferedWriter(new FileWriter("Usuarios.txt", true))) {
  	        bw.write("Nombre: " + textNombre.getText());
  	        bw.newLine();
  	        bw.write("Apellidos: " + textApellidos.getText());
  	        bw.newLine();
  	        bw.write("Correo: " + textCorreoElectronico.getText());
  	        bw.newLine();
  	        bw.write("DNI: " + textDni.getText());
  	        bw.newLine();
  	        bw.write("Direccion: " + textDireccion.getText());
  	        bw.newLine();
  	        bw.write("Telefono: " + textTelefono.getText());
  	        bw.newLine();
  	        bw.write("Cuenta: " + textCuentaBancaria.getText());
  	        bw.newLine();
  	        bw.write("Zona: " + textZona.getText());
  	        bw.newLine();
  	        bw.write("Accion: ADOPTAR");
 	        bw.newLine();
  	        bw.write("----------------");
  	        bw.newLine();
  	   } catch (IOException e) {
  	        e.printStackTrace();
  	    }
  }
     
    @FXML
    void writeFileApadrinar(ActionEvent event) {
    	 try (BufferedWriter bw = new BufferedWriter(new FileWriter("ApadrinarZona1.txt", true))) {
 	        bw.write("Nombre: " + textNombre.getText());
 	        bw.newLine();
 	        bw.write("Apellidos: " + textApellidos.getText());
 	        bw.newLine();
 	        bw.write("Correo: " + textCorreoElectronico.getText());
 	        bw.newLine();
 	        bw.write("Telefono: " + textTelefono.getText());
 	        bw.newLine();
 	        bw.write("----------------");
 	        bw.newLine();
 	   } catch (IOException e) {
 	        e.printStackTrace();
 	   }
    	 try (BufferedWriter bw = new BufferedWriter(new FileWriter("Usuarios.txt", true))) {
  	        bw.write("Nombre: " + textNombre.getText());
  	        bw.newLine();
  	        bw.write("Apellidos: " + textApellidos.getText());
  	        bw.newLine();
  	        bw.write("Correo: " + textCorreoElectronico.getText());
  	        bw.newLine();
  	        bw.write("DNI: " + textDni.getText());
  	        bw.newLine();
  	        bw.write("Direccion: " + textDireccion.getText());
  	        bw.newLine();
  	        bw.write("Telefono: " + textTelefono.getText());
  	        bw.newLine();
  	        bw.write("Cuenta: " + textCuentaBancaria.getText());
  	        bw.newLine();
  	        bw.write("Zona: " + textZona.getText());
  	        bw.newLine();
  	        bw.write("Accion: APADRINAR");
 	        bw.newLine();
  	        bw.write("----------------");
  	        bw.newLine();
  	   } catch (IOException e) {
  	        e.printStackTrace();
  	    }
  }

    @FXML
    void writeFilePasear(ActionEvent event) {
     	 try (BufferedWriter bw = new BufferedWriter(new FileWriter("PasearZona1.txt", true))) {
 	        bw.write("Nombre: " + textNombre.getText());
 	        bw.newLine();
 	        bw.write("Apellidos: " + textApellidos.getText());
 	        bw.newLine();
 	        bw.write("Correo: " + textCorreoElectronico.getText());
 	        bw.newLine();
 	        bw.write("Telefono: " + textTelefono.getText());
 	        bw.newLine();
 	        bw.write("----------------");
 	        bw.newLine();
 	   } catch (IOException e) {
 	        e.printStackTrace();
 	    }
    	 try (BufferedWriter bw = new BufferedWriter(new FileWriter("Usuarios.txt", true))) {
  	        bw.write("Nombre: " + textNombre.getText());
  	        bw.newLine();
  	        bw.write("Apellidos: " + textApellidos.getText());
  	        bw.newLine();
  	        bw.write("Correo: " + textCorreoElectronico.getText());
  	        bw.newLine();
  	        bw.write("DNI: " + textDni.getText());
  	        bw.newLine();
  	        bw.write("Direccion: " + textDireccion.getText());
  	        bw.newLine();
  	        bw.write("Telefono: " + textTelefono.getText());
  	        bw.newLine();
  	        bw.write("Cuenta: " + textCuentaBancaria.getText());
  	        bw.newLine();
  	        bw.write("Zona: " + textZona.getText());
  	        bw.newLine();
  	        bw.write("Accion: PASEAR");
 	        bw.newLine();
  	        bw.write("----------------");
  	        bw.newLine();
  	   } catch (IOException e) {
  	        e.printStackTrace();
  	    }
    }
}



