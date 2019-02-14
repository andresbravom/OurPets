import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		ListaUsuarios l = new ListaUsuarios();
		
		
		Admins adminM = new Admins ("AdminMASTER", "qwerty");
		Admins admin1 = new Admins ("Admin1", "qwerty");
		Admins admin2 = new Admins ("Admin2", "qwerty");
		Admins admin3 = new Admins ("Admin3", "qwerty");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introducir usuario: ");
		String usuario = sc.nextLine();
		System.out.println("Introducir contraseña: ");
		String contraseña = sc.nextLine();
		
		if(Admins.authentication(usuario,contraseña)) {
			l.mostrarListaGeneral();
		}
		
		
		l.addUser();
		
		
	}

}
