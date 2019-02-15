import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
	static User actualUser;
	
	Scanner sc = new Scanner(System.in);
	/*
	 * Captura los datos del usuario
	 */
	private User createUser() {
		System.out.println("Introducir un nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Introduzca un apellido: ");
		String apellido = sc.nextLine();
		System.out.println("Introduzca un correo electrónico: ");
		String correo = sc.nextLine();
		System.out.println("Introduzca el DNI: ");
		String dni = sc.nextLine();
		System.out.println("Introduzca la dirección: ");
		String direccion = sc.nextLine();
		System.out.println("Introduzca un teléfono de contacto: ");
		String telefono = sc.nextLine();
		System.out.println("Introduzca un número de cuenta: ");
		String cuenta = sc.nextLine();
		System.out.println("Introduzca el número de zona: ");
		String zona = sc.nextLine();
		System.out.println("Elegir una acción: ");
		String accion = sc.nextLine();
		
		return new User(nombre, apellido, correo, dni, direccion, telefono, cuenta, zona, accion);
	}
	/*
	 * Añade un usuario a la lista
	 */
	void addUser() {
		FileWriter fw1 = null;
		FileWriter fw2 = null;
		FileWriter fw3 = null;
		FileWriter fw4 = null;
	
		try {
		User user = createUser();
		lUsuarios.add(user);
		
		File fileGeneral = new File("./Usuarios.txt");
		File fileZona1Adoptar = new File ("./AdoptarZona1.txt");
		File fileZona1Apadrinar = new File ("./ApadrinarZona1.txt");
		File fileZona1Pasear = new File ("./PasearZona1.txt");
		
		/*
		 * Fichero GENERAL(Se guarda por defecto)
		 */
		
		fw1 = new FileWriter(fileGeneral.getAbsoluteFile(), true);
		
		fw1.write("Nombre: " + user.getNombre() + "\r\n");
		fw1.write("Apellido: " + user.getApellido() + "\r\n");
		fw1.write("Correo: " + user.getCorreo()+ "\r\n");
		fw1.write("DNI: " + user.getCuenta() + "\r\n");
		fw1.write("Dirección: " + user.getDireccion() + "\r\n");
		fw1.write("Teléfono: " + user.getTelefono() + "\r\n");
		fw1.write("Cuenta: " + user.getCuenta() + "\r\n");
		fw1.write("Zona: " + user.getZona() + "\r\n");
		fw1.write("Acción: " + user.getAccion() + "\r\n");	
		fw1.write("----------------\r\n");
		fw1.close();
		
		
		switch (user.getAccion()) {

		/*
		 * Opcion1: Se almacenan los datos en el Fichero ADOPTAR
		 */
		case "1":
		fw2 = new FileWriter(fileZona1Adoptar.getAbsoluteFile(), true);

		fw2.write("Nombre: " + user.getNombre() + "\r\n");
		fw2.write("Apellido: " + user.getApellido() + "\r\n");
		fw2.write("Correo: " + user.getCorreo() + "\r\n");
		fw2.write("Teléfono: " + user.getTelefono() + "\r\n");
		fw2.write("----------------\r\n");
		fw2.close();
		
		break;
		
		/*
		 * Opcion2: Se almacenan los datos en el Fichero APADRINAR
		 */
		case "2":
		
		fw3 = new FileWriter(fileZona1Apadrinar.getAbsoluteFile(), true);
		
		
		fw3.write("Nombre: " + user.getNombre() + "\r\n");
		fw3.write("Apellido: " + user.getApellido() + "\r\n");
		fw3.write("Correo: " + user.getCorreo() + "\r\n");
		fw3.write("Teléfono: " + user.getTelefono() + "\r\n");
		fw3.write("----------------\r\n");
		fw3.close();
		break;

		/*
		 * Opcion3: Se almacenan los datos en el Fichero PASEAR
		 */
		case "3":
		
		fw4 = new FileWriter(fileZona1Pasear.getAbsoluteFile(), true);
		
		fw4.write("Nombre: " + user.getNombre() + "\r\n");
		fw4.write("Apellido: " + user.getApellido() + "\r\n");
		fw4.write("Correo: " + user.getCorreo() + "\r\n");
		fw4.write("Teléfono: " + user.getTelefono() + "\r\n");
		fw4.write("----------------\r\n");
		fw4.close();
		break;
		
		default:
			System.out.println("Introducir una opcion válida");
		break;
		}
		System.out.println("\nUsuario dado de alta correctamente\n");
			
		}		
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();	
		}finally {
			try {
				if(fw1 != null) 
					fw1.close();
				else if(fw2 != null )
					fw2.close();
				else if(fw3 != null)
					fw3.close();
				else if(fw4 != null)
					fw4.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}	
	}
	/*
	 * Este método permite que el usuario visualice los datos que ha introducido tras haberse dado de alta
	 */
	void mostrarTodosUsuarios() {
		for(int i=0; i<lUsuarios.size(); i++) {
			lUsuarios.get(i).mostrarUsuarios();
		}
	}	
	/*
	 * Muestra al ADMNINMASTER el listado general de los usuarios con todos los datos requeridos
	 * al haberse dado de alta. Sólo hay un ADMNINMASTER
	 */
	void mostrarListaGeneral() {
		BufferedReader br = null;
		
		try {
			String currentLine;
			br = new BufferedReader(new FileReader("./Usuarios.txt"));
			while((currentLine = br.readLine()) != null) {
				System.out.println(currentLine);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) {
					br.close();
				}
			}catch(IOException ex) {
				ex.printStackTrace();
			
			}
		}
	}
	/*
	 * Muestra los listados dependiendo de la acción del usuario, esto esta visible
	 * sólo para los admins regustrados. Se ha dado de alta a 3 ADMINS
	 */
	void mostrarListados() {
		BufferedReader br = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			String currentLine;
			System.out.println("Elegir un opción");
			String option = sc.nextLine();
			
			switch(option) {
			/*
			 * FICHERO ADOPTAR
			 */
			case "1":
				br = new BufferedReader(new FileReader("./AdoptarZona1.txt"));
				while((currentLine = br.readLine()) != null) {
					System.out.println(currentLine);	
				}
				break;
			/*
			 * FICHERO APADRINAR
			 */
			case "2":
				br = new BufferedReader(new FileReader("./ApadrinarZona1.txt"));
				while((currentLine = br.readLine()) != null) {
					System.out.println(currentLine);
				}
				break;
			/*
			 * FICHERO PASEAR
			 */
			case "3":
				br = new BufferedReader(new FileReader("./PasearZona1.txt"));
				while((currentLine = br.readLine()) != null) {
					System.out.println(currentLine);	
				}
				break;
			default:
				break;
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) {
					br.close();
				}		
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
