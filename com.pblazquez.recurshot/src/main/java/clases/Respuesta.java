package clases;

import java.util.ArrayList;

public class Respuesta {
	private ArrayList<Respuesta> respuestas;
	private String contenido;
	private Usuario usuario;
	public Respuesta(ArrayList<Respuesta> respuestas, String contenido, Usuario usuario) {
		super();
		this.respuestas = respuestas;
		this.contenido = contenido;
		this.usuario = usuario;
	}
	public ArrayList<Respuesta> getRespuestas() {
		return respuestas;
	}
	public void setRespuestas(ArrayList<Respuesta> respuestas) {
		this.respuestas = respuestas;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	@Override
	public String toString() {
		return "Respuesta [respuestas=" + respuestas + ", contenido=" + contenido + ", usuario=" + usuario + "]";
	}
	
	
}
