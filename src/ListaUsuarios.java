import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaUsuarios {
	private ArrayList <User> lUsuarios = new ArrayList <User>();

	public ArrayList<User> getlUsuarios() {
		return lUsuarios;
	}

	public void setlUsuarios(ArrayList<User> lUsuarios) {
		this.lUsuarios = lUsuarios;
	}
	
	Scanner sc = new Scanner(System.in);
	
	private User createUser() {
		System.out.println("Introducir un nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Introduzca un apellido: ");
		String apellido = sc.nextLine();
		System.out.println("Introduzca un correo electrónico");
		String correo = sc.nextLine();
		System.out.println("Introduzca el DNI");
		String dni = sc.nextLine();
		System.out.println("Introduzca la dirección");
		String direccion = sc.nextLine();
		System.out.println("Introduzca un teléfono de contacto");
		String telefono = sc.nextLine();
		System.out.println("Introduzca un número de cuenta");
		String cuenta = sc.nextLine();
		System.out.println("Introduzca el número de zona");
		String zona = sc.nextLine();
		System.out.println("IElegir acción");
		String accion = sc.nextLine();
		
		return new User(nombre, apellido, correo, dni, direccion, telefono, cuenta, zona, accion);
	}
	
	void addUser() {
		FileWriter fw1 = null;
		BufferedWriter bw1 = null;
		FileWriter fw2 = null;
		BufferedWriter bw2 = null;
		FileWriter fw3 = null;
		BufferedWriter bw3 = null;
		FileWriter fw4 = null;
		BufferedWriter bw4 = null;
		
		try {
		User user = createUser();
		lUsuarios.add(user);
		
		File fileGeneral = new File("./Usuarios.txt");
		File fileZona1Adoptar = new File ("./AdoptarZona1.txt");
		File fileZona1Apadrinar = new File ("./ApadrinarZona1.txt");
		File fileZona1Pasear = new File ("./PasearZona1.txt");
		/*
		 * Se agregan los datos al fichero general
		 */
		if (!fileGeneral.exists()) {
			fileGeneral.createNewFile();
			
		}
		fw1 = new FileWriter(fileGeneral.getAbsoluteFile(), true);
		bw1 = new BufferedWriter(fw1);
		bw1.write("Nombre: " + user.getNombre() + "\r\n");
		bw1.write("Apellido: " + user.getApellido() + "\r\n");
		bw1.write("Correo: " + user.getCorreo()+ "\r\n");
		bw1.write("DNI: " + user.getCuenta() + "\r\n");
		bw1.write("Dirección: " + user.getDireccion() + "\r\n");
		bw1.write("Teléfono: " + user.getTelefono() + "\r\n");
		bw1.write("Cuenta: " + user.getCuenta() + "\r\n");
		bw1.write("Zona: " + user.getZona() + "\r\n");
		bw1.write("Acción: " + user.getAccion() + "\r\n");	
		bw1.write("----------------\r\n");
	
		/*
		 * Zona1 ADOPTAR
		 */
		if(!fileZona1Adoptar.exists()) {
			fileZona1Adoptar.createNewFile();
		}
		fw2 = new FileWriter(fileZona1Adoptar.getAbsoluteFile(), true);
		bw2 = new BufferedWriter(fw2);
		
		bw2.write("Nombre: " + user.getNombre() + "\r\n");
		bw2.write("Apellido: " + user.getApellido() + "\r\n");
		bw2.write("Correo: " + user.getCorreo() + "\r\n");
		bw2.write("Teléfono: " + user.getTelefono() + "\r\n");
		bw2.write("----------------\r\n");
		
		/*
		 * Zona1 APADRINAR
		 */
		if(!fileZona1Apadrinar.exists()) {
			fileZona1Apadrinar.createNewFile();
		}
		fw3 = new FileWriter(fileZona1Apadrinar.getAbsoluteFile(), true);
		bw3 = new BufferedWriter(fw3);
		
		bw3.write("Nombre: " + user.getNombre() + "\r\n");
		bw3.write("Apellido: " + user.getApellido() + "\r\n");
		bw3.write("Correo: " + user.getCorreo() + "\r\n");
		bw3.write("Teléfono: " + user.getTelefono() + "\r\n");
		bw3.write("----------------\r\n");
		
		/*
		 * Zona1 PASEAR
		 */
		if(!fileZona1Pasear.exists()) {
			fileZona1Pasear.createNewFile();
		}
		fw4 = new FileWriter(fileZona1Pasear.getAbsoluteFile(), true);
		bw4 = new BufferedWriter(fw4);
		
		bw4.write("Nombre: " + user.getNombre() + "\r\n");
		bw4.write("Apellido: " + user.getApellido() + "\r\n");
		bw4.write("Correo: " + user.getCorreo() + "\r\n");
		bw4.write("Teléfono: " + user.getTelefono() + "\r\n");
		bw4.write("----------------\r\n");
		
		System.out.println("\nUsuario dado de alta correctamente\n");
				
		}
				
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();	
		}finally {
			try {
				if(bw1 != null & bw2 != null & bw3 != null & bw4 != null) {
					bw1.close();
					bw2.close();
					bw3.close();
					bw4.close();
				}
				if(fw1 != null & fw2 != null & fw3 != null & fw4 != null) {
					fw1.close();
					fw2.close();
					fw3.close();
					fw4.close();
				}
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		}	
	}
	void mostrarTodosUsuarios() {
		for(int i=0; i<lUsuarios.size(); i++) {
			lUsuarios.get(i).mostrarUsuarios();
		}
	}		
}
