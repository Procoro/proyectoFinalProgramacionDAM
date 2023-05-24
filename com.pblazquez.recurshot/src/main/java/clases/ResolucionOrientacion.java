package clases;

import enums.Orientacion;

public class ResolucionOrientacion extends ComponenteEdicion{
	private Orientacion orientacion;

	public ResolucionOrientacion(String nombre, int duracion, boolean gratuito, String rutaDescarga, Foro foro,
			Orientacion orientacion) {
		super(nombre, duracion, gratuito, rutaDescarga, foro);
		this.orientacion = orientacion;
	}

	public Orientacion getOrientacion() {
		return orientacion;
	}

	public void setOrientacion(Orientacion orientacion) {
		this.orientacion = orientacion;
	}

	@Override
	public String toString() {
		return "ResolucionOrientacion [orientacion=" + orientacion + "]";
	}
	
}
