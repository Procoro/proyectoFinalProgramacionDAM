package interfaces;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import clases.Usuario;
import enums.Suscripcion;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

public class PantallaRegistro extends JPanel{
	private Ventana ventana;
	private JTextField campoNombreRegistro;
	private JTextField campoEmailRegistro;
	private JTextField campoNickRegistro;
	private JPasswordField campoContrasenaRegistro;
	private JTextField campoTelefonoRegistro;
	public PantallaRegistro(Ventana v) {
		this.ventana=v;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 177, 0, 180, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblTituloRegistro = new JLabel("Registro recurSHOT");
		lblTituloRegistro.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblTituloRegistro = new GridBagConstraints();
		gbc_lblTituloRegistro.gridwidth = 3;
		gbc_lblTituloRegistro.gridheight = 2;
		gbc_lblTituloRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_lblTituloRegistro.gridx = 2;
		gbc_lblTituloRegistro.gridy = 1;
		add(lblTituloRegistro, gbc_lblTituloRegistro);
		
		JLabel labelNombreRegistro = new JLabel("Nombre");
		labelNombreRegistro.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_labelNombreRegistro = new GridBagConstraints();
		gbc_labelNombreRegistro.fill = GridBagConstraints.HORIZONTAL;
		gbc_labelNombreRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_labelNombreRegistro.gridx = 2;
		gbc_labelNombreRegistro.gridy = 4;
		add(labelNombreRegistro, gbc_labelNombreRegistro);
		
		campoNombreRegistro = new JTextField();
		GridBagConstraints gbc_campoNombreRegistro = new GridBagConstraints();
		gbc_campoNombreRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_campoNombreRegistro.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoNombreRegistro.gridx = 4;
		gbc_campoNombreRegistro.gridy = 4;
		add(campoNombreRegistro, gbc_campoNombreRegistro);
		campoNombreRegistro.setColumns(10);
		
		JLabel labelEmailRegistro = new JLabel("Email");
		labelEmailRegistro.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_labelEmailRegistro = new GridBagConstraints();
		gbc_labelEmailRegistro.fill = GridBagConstraints.HORIZONTAL;
		gbc_labelEmailRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_labelEmailRegistro.gridx = 2;
		gbc_labelEmailRegistro.gridy = 5;
		add(labelEmailRegistro, gbc_labelEmailRegistro);
		
		campoEmailRegistro = new JTextField();
		campoEmailRegistro.setColumns(10);
		GridBagConstraints gbc_campoEmailRegistro = new GridBagConstraints();
		gbc_campoEmailRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_campoEmailRegistro.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoEmailRegistro.gridx = 4;
		gbc_campoEmailRegistro.gridy = 5;
		add(campoEmailRegistro, gbc_campoEmailRegistro);
		
		JLabel labelContrasenaRegistro = new JLabel("Contraseña");
		labelContrasenaRegistro.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_labelContrasenaRegistro = new GridBagConstraints();
		gbc_labelContrasenaRegistro.fill = GridBagConstraints.HORIZONTAL;
		gbc_labelContrasenaRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_labelContrasenaRegistro.gridx = 2;
		gbc_labelContrasenaRegistro.gridy = 6;
		add(labelContrasenaRegistro, gbc_labelContrasenaRegistro);
		
		campoContrasenaRegistro = new JPasswordField();
		GridBagConstraints gbc_campoContrasenaRegistro = new GridBagConstraints();
		gbc_campoContrasenaRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_campoContrasenaRegistro.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoContrasenaRegistro.gridx = 4;
		gbc_campoContrasenaRegistro.gridy = 6;
		add(campoContrasenaRegistro, gbc_campoContrasenaRegistro);
		
		JLabel labelNickRegistro = new JLabel("Nick");
		labelNickRegistro.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_labelNickRegistro = new GridBagConstraints();
		gbc_labelNickRegistro.fill = GridBagConstraints.HORIZONTAL;
		gbc_labelNickRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_labelNickRegistro.gridx = 2;
		gbc_labelNickRegistro.gridy = 7;
		add(labelNickRegistro, gbc_labelNickRegistro);
		
		campoNickRegistro = new JTextField();
		campoNickRegistro.setColumns(10);
		GridBagConstraints gbc_campoNickRegistro = new GridBagConstraints();
		gbc_campoNickRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_campoNickRegistro.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoNickRegistro.gridx = 4;
		gbc_campoNickRegistro.gridy = 7;
		add(campoNickRegistro, gbc_campoNickRegistro);
		
		JLabel labelTelefonoRegistro = new JLabel("Teléfono");
		labelTelefonoRegistro.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_labelTelefonoRegistro = new GridBagConstraints();
		gbc_labelTelefonoRegistro.fill = GridBagConstraints.HORIZONTAL;
		gbc_labelTelefonoRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_labelTelefonoRegistro.gridx = 2;
		gbc_labelTelefonoRegistro.gridy = 8;
		add(labelTelefonoRegistro, gbc_labelTelefonoRegistro);
		
		campoTelefonoRegistro = new JTextField();
		campoTelefonoRegistro.setColumns(10);
		GridBagConstraints gbc_campoTelefonoRegistro = new GridBagConstraints();
		gbc_campoTelefonoRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_campoTelefonoRegistro.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoTelefonoRegistro.gridx = 4;
		gbc_campoTelefonoRegistro.gridy = 8;
		add(campoTelefonoRegistro, gbc_campoTelefonoRegistro);
		
		JButton buttonVolverInicio = new JButton("Ya estoy registrado");
		buttonVolverInicio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(PantallaLogin.class);
			}
		});
		GridBagConstraints gbc_buttonVolverInicio = new GridBagConstraints();
		gbc_buttonVolverInicio.fill = GridBagConstraints.HORIZONTAL;
		gbc_buttonVolverInicio.insets = new Insets(0, 0, 0, 5);
		gbc_buttonVolverInicio.gridx = 2;
		gbc_buttonVolverInicio.gridy = 10;
		add(buttonVolverInicio, gbc_buttonVolverInicio);
		
		JButton buttonRegistrarse = new JButton("Registrarme");
		buttonRegistrarse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String nombre=campoNombreRegistro.getText().toString();
				String email=campoEmailRegistro.getText();
				String contrasena=new String(campoContrasenaRegistro.getPassword());
				String nick=campoNickRegistro.getText();
				String telefono=campoTelefonoRegistro.getText();
				try {
					new Usuario(nombre, nick, contrasena, telefono, email, Suscripcion.FREE, null, null);
					JOptionPane.showMessageDialog(ventana,"Registrado correctamente","Éxito",JOptionPane.INFORMATION_MESSAGE);
				} catch (SQLIntegrityConstraintViolationException e3) {
					JOptionPane.showMessageDialog(ventana, "El email ya existe","No se pudo registrar",JOptionPane.ERROR_MESSAGE);
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(ventana, e1.getMessage(),"No se puede conectar a la base de datos",JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				} catch(NumberFormatException e2) {
					JOptionPane.showMessageDialog(ventana, "Tienes que poner un número de teléfono existente","Número de telefono incorrecto",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		GridBagConstraints gbc_buttonRegistrarse = new GridBagConstraints();
		gbc_buttonRegistrarse.fill = GridBagConstraints.HORIZONTAL;
		gbc_buttonRegistrarse.insets = new Insets(0, 0, 0, 5);
		gbc_buttonRegistrarse.gridx = 4;
		gbc_buttonRegistrarse.gridy = 10;
		add(buttonRegistrarse, gbc_buttonRegistrarse);
	}
}
