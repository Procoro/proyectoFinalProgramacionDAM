package interfaces;

import javax.swing.JPanel;

import clases.ComponenteEdicion;

import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaDescarga extends JPanel{
	private Ventana ventana;
	private ComponenteEdicion descargable;
	public PantallaDescarga(Ventana v,ComponenteEdicion ce) {
		ventana=v;
		descargable=ce;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 164, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 41, 64, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel labelRecurso = new JLabel("Descargar "+descargable.getNombre());
		GridBagConstraints gbc_labelRecurso = new GridBagConstraints();
		gbc_labelRecurso.insets = new Insets(0, 0, 5, 5);
		gbc_labelRecurso.gridx = 1;
		gbc_labelRecurso.gridy = 1;
		add(labelRecurso, gbc_labelRecurso);
		
		JButton botonDescargar = new JButton("Descargar");
		botonDescargar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				descargable.getRutaDescarga(); // "./recursos/videos/pollosantaldo.mp4
			}
		});
		GridBagConstraints gbc_botonDescargar = new GridBagConstraints();
		gbc_botonDescargar.insets = new Insets(0, 0, 5, 5);
		gbc_botonDescargar.fill = GridBagConstraints.BOTH;
		gbc_botonDescargar.gridx = 1;
		gbc_botonDescargar.gridy = 3;
		add(botonDescargar, gbc_botonDescargar);
		
		JButton botonAtras = new JButton("Atras");
		GridBagConstraints gbc_botonAtras = new GridBagConstraints();
		gbc_botonAtras.insets = new Insets(0, 0, 5, 5);
		gbc_botonAtras.gridx = 1;
		gbc_botonAtras.gridy = 4;
		add(botonAtras, gbc_botonAtras);
	}
	
	

}
