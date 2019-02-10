
public class User {
	private String nombre;
	private String apellido;
	private String correo;
	private String dni;
	private String direccion;
	private String telefono;
	private String cuenta;
	private String zona;
	private String accion;

	User( String nombre, String apellido, String correo, String dni, String direccion, String telefono, String cuenta, String zona, String accion){
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
		this.cuenta = cuenta;
		this.zona = zona;
		this.accion = accion;
	}
	
	User(String nombre, String apellido, String correo, String telefono, String zona){
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.telefono = telefono;
		this.zona = zona;	
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}
	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}
	
	void mostrarUsuarios() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Correo: " + correo);
		System.out.println("dni: " + dni);
		System.out.println("Dirección: " + direccion);
		System.out.println("Teléfono: " + telefono);
		System.out.println("Cuenta: " + cuenta);
		System.out.println("Zona: " + zona);
		System.out.println("Acción: " + zona);
	}
		
}
	
