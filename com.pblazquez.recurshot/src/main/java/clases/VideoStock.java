package clases;

import enums.Orientacion;
import enums.TipoVideo;

public class VideoStock extends ResolucionOrientacion{
	private TipoVideo tipovideo;

	
	public VideoStock(String nombre, int duracion, boolean gratuito, String rutaDescarga, Foro foro,
			Orientacion orientacion, TipoVideo tipovideo) {
		super(nombre, duracion, gratuito, rutaDescarga, foro, orientacion);
		this.tipovideo = tipovideo;
	}

	public TipoVideo getTipovideo() {
		return tipovideo;
	}

	public void setTipovideo(TipoVideo tipovideo) {
		this.tipovideo = tipovideo;
	}
	 
	
}
