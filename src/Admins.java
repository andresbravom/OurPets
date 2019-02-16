import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Admins {
	private String usuario;
	private String password;
	static ArrayList<Admins> listaAdmins = new ArrayList<Admins>();
	static Admins actualAdmin;
	
	Admins (String usuario, String password){
		this.usuario = usuario;
		this.password = password;
		listaAdmins.add(this);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return password;
	}

	public void setContraseña(String password) {
		this.password = password;
	}
	public ArrayList<Admins> getListaAdmins() {
		return listaAdmins;
	}

	public void setListaAdmins(ArrayList<Admins> listaAdmins) {
		this.listaAdmins = listaAdmins;
	}
	/*
	 * Autenticación de los admins
	 */
	static boolean authentication(String usuario, String password) {
		boolean login = false;
		
		for(int i =0; i<listaAdmins.size(); i++) {
			if(usuario.equals(listaAdmins.get(i).getUsuario()) && password.equals(listaAdmins.get(i).getContraseña())) {
				login =true;
				actualAdmin = listaAdmins.get(i);
				break;
			}
		}
		return login;
	}	
}
