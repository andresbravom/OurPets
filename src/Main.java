import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		ListaUsuarios l = new ListaUsuarios();
		
		Admins adminM = new Admins ("1", "qwerty");
		Admins admin1 = new Admins ("Admin1", "qwerty");
		Admins admin2 = new Admins ("Admin2", "qwerty");
		Admins admin3 = new Admins ("Admin3", "qwerty");
	
		General.Inicio();

	}
}
