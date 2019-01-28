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
	
	void addUser() {
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
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
		
		User user = new User(nombre, apellido, correo, dni, direccion, telefono, cuenta);
		lUsuarios.add(user);
		
		File file = new File("./Usuarios.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		fw = new FileWriter(file.getAbsoluteFile(), true);
		bw = new BufferedWriter(fw);
		bw.write("Nombre: " + nombre + "\r\n");
		bw.write("Apellido: " + apellido + "\r\n");
		bw.write("Correo: " + correo + "\r\n");
		bw.write("DNI: " + dni + "\r\n");
		bw.write("Dirección: " + direccion + "\r\n");
		bw.write("Teléfono: " + telefono + "\r\n");
		bw.write("----------------\r\n");
		
		System.out.println("\nUsuario dado de alta correctamente\n");
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();	
		}finally {
			try {
				if(bw != null) {
					bw.close();
				}
				if(fw != null) {
					fw.close();
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
	
	void zona1Adoptar() {
		FileWriter fw = null;
		BufferedWriter bw = null;
	
		try {
			System.out.println("Introducir un nombre: ");
			String nombre = sc.nextLine();
			System.out.println("Introduzca un apellido: ");
			String apellido = sc.nextLine();
			System.out.println("Introduzca un correo electrónico");
			String correo = sc.nextLine();
			System.out.println("Introduzca un teléfono de contacto");
			String telefono = sc.nextLine();
			
			
			
			User user = new User(nombre, apellido, correo, telefono);
			
			lUsuarios.add(user);
			
			File file = new File("./ADOPTAR_Zona1.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);
			
			bw.write("Nombre: " + nombre + "\r\n");
			bw.write("Apellido: " + apellido + "\r\n");
			bw.write("Correo: " + correo + "\r\n");
			bw.write("Teléfono: " + telefono + "\r\n");
			bw.write("Nombre: " + nombre + "\r\n");
			bw.write("----------------\r\n");
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bw != null) {
					bw.close();
				}
				if(fw != null) {
					fw.close();
				}
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
