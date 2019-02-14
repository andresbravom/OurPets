import java.util.ArrayList;

public class Admins {
	private String usuario;
	private String contraseña;
	private ArrayList<Admins> listaAdmins = new ArrayList<Admins>();
	static Admins actualAdmin;
	
	Admins (String usuario, String contraseña){
		this.usuario = usuario;
		this.contraseña = contraseña;
		listaAdmins.add(this);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public ArrayList<Admins> getListaAdmins() {
		return listaAdmins;
	}

	public void setListaAdmins(ArrayList<Admins> listaAdmins) {
		this.listaAdmins = listaAdmins;
	}
	
	boolean authentication(String usuario, String contraseña) {
		boolean login = false;
		
		for(int i =0; i<listaAdmins.size(); i++) {
			if(usuario.equals(listaAdmins.get(i).getUsuario()) && contraseña.equals(listaAdmins.get(i).getContraseña())) {
				login =true;
				actualAdmin = listaAdmins.get(i);
				break;
			}
		}
		return login;
	}
	
}
