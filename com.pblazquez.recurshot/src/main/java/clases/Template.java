package clases;

import enums.Orientacion;
import enums.Programa;

public class Template extends ResolucionOrientacion{
	private Programa programa;

	public Template(String nombre, int duracion, boolean gratuito, String rutaDescarga, Foro foro,
			Orientacion orientacion, Programa programa) {
		super(nombre, duracion, gratuito, rutaDescarga, foro, orientacion);
		this.programa = programa;
	}

	public Programa getPrograma() {
		return programa;
	}

	public void setPrograma(Programa programa) {
		this.programa = programa;
	}

	@Override
	public String toString() {
		return "Template [programa=" + programa + "]";
	}
	
	
}
