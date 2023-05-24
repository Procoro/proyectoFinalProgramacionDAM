package clases;

import java.util.ArrayList;

public class Comentario {
	private Usuario escritor;
	private ArrayList<Respuesta> respuesta;
	private String titulo;
	private String contenido;
	public Comentario(Usuario escritor, ArrayList<Respuesta> respuesta, String titulo, String contenido) {
		super();
		this.escritor = escritor;
		this.respuesta = respuesta;
		this.titulo = titulo;
		this.contenido = contenido;
	}
	public Usuario getEscritor() {
		return escritor;
	}
	public void setEscritor(Usuario escritor) {
		this.escritor = escritor;
	}
	public ArrayList<Respuesta> getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(ArrayList<Respuesta> respuesta) {
		this.respuesta = respuesta;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	@Override
	public String toString() {
		return "Comentario [escritor=" + escritor + ", titulo=" + titulo + ", contenido=" + contenido + "]";
	}
	
	
}
