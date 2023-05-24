package clases;

import enums.Suscripcion;

public class ComponenteEdicion extends ElementoConNombre{
	private int duracion;
	private boolean gratuito;
	private String rutaDescarga;
	private Foro foro;
	private Suscripcion suscripcion;
	public ComponenteEdicion(String nombre, int duracion, boolean gratuito, String rutaDescarga, Foro foro,Suscripcion suscripcion) {
		super(nombre);
		this.duracion = duracion;
		this.gratuito = gratuito;
		this.rutaDescarga = rutaDescarga;
		this.foro = foro;
		this.suscripcion = suscripcion;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public boolean isGratuito() {
		return gratuito;
	}
	public void setGratuito(boolean gratuito) {
		this.gratuito = gratuito;
	}
	public String getRutaDescarga() {
		return rutaDescarga;
	}
	public void setRutaDescarga(String rutaDescarga) {
		this.rutaDescarga = rutaDescarga;
	}
	public Foro getForo() {
		return foro;
	}
	public void setForo(Foro foro) {
		this.foro = foro;
	}
	
	
}
