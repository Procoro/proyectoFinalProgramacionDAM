package clases;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

import enums.Suscripcion;
import utils.DAO;

public class Audio extends ComponenteEdicion{
	private short bmp;

	public Audio(String nombre, int duracion, boolean gratuito, String rutaDescarga, Foro foro, short bmp,Suscripcion suscripcion) {
		super(nombre, duracion, gratuito, rutaDescarga, foro, suscripcion);
		this.bmp = bmp;
	}

	public short getBmp() {
		return bmp;
	}

	public void setBmp(short bmp) {
		this.bmp = bmp;
	}

	@Override
	public String toString() {
		return "Audio [bmp=" + bmp + "]";
	}
	
	public static ArrayList<Audio> getTodos(Suscripcion suscripcionMinima) throws SQLException{
		ArrayList<Audio> listaCompleta = new ArrayList<>();
		ArrayList<Object> objetoSuscripcion = new ArrayList<>();
		LinkedHashSet<String> columnas = new LinkedHashSet<>();
		columnas.add("nombre");
		columnas.add("duracion");
		columnas.add("gratuito");
		columnas.add("rutaDescarga");
		columnas.add("bpm");
		HashMap<String, Object> where = new HashMap<>();
		where.put("suscripcion", where);
		if(suscripcionMinima==Suscripcion.LIMITED) {
			
			objetoSuscripcion=DAO.consultar("audio", columnas, where);
			return listaCompleta;
		}else {
			if(suscripcionMinima==Suscripcion.UNLIMITED) {
				
			}else {
				
			}
		}
		return listaCompleta;
		//Usa el dao para hacer: Si la suscripcion minima es unlimited : select * from audio; 
		//Si la suscripcion minima es limited select * from audio where suscripcionMinima!=unlimited 
		//Si la suscripcionMinima es free, select * from audio where suscripcion;Minima=free
	}
	
	
}
