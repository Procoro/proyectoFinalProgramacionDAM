package clases;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.TreeSet;

import enums.Suscripcion;
import utils.DAO;

public class Usuario extends ElementoConNombre{
	private String nick;
	private String contrasena;
	private String telefonoContacto;
	private String email;
	private Suscripcion suscripcion;
	TreeSet<ComponenteEdicion> descargas=new TreeSet<ComponenteEdicion>();
	TreeSet<ComponenteEdicion> subidas=new TreeSet<ComponenteEdicion>();
	
	public Usuario(String nombre, String nick, String contrasena, String telefonoContacto, String email,
			Suscripcion suscripcion, TreeSet<ComponenteEdicion> descargas, TreeSet<ComponenteEdicion> subidas) throws SQLException {
		super(nombre);
		HashMap<String,Object> cols = new HashMap<String,Object>();
		cols.put("nick", nick);
		cols.put("contrasena", contrasena);
		cols.put("telefonoContacto", telefonoContacto);
		cols.put("email", email);
		cols.put("suscripcion", suscripcion);
		cols.put("numDescargas", descargas);
		cols.put("numSubidas", subidas);
		DAO.insertar("usuario", cols);
		
		this.nick = nick;
		this.contrasena = contrasena;
		this.telefonoContacto = telefonoContacto;
		this.email = email;
		this.suscripcion = suscripcion;
		this.descargas = descargas;
		this.subidas = subidas;
		
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getTelefonoContacto() {
		return telefonoContacto;
	}

	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Suscripcion getSuscripcion() {
		return suscripcion;
	}

	public void setSuscripcion(Suscripcion suscripcion) {
		this.suscripcion = suscripcion;
	}

	public TreeSet<ComponenteEdicion> getDescargas() {
		return descargas;
	}

	public void setDescargas(TreeSet<ComponenteEdicion> descargas) {
		this.descargas = descargas;
	}

	public TreeSet<ComponenteEdicion> getSubidas() {
		return subidas;
	}

	public void setSubidas(TreeSet<ComponenteEdicion> subidas) {
		this.subidas = subidas;
	}  
	
	
	
}
