package interfaces;

import java.awt.Container;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import net.miginfocom.swing.MigLayout;
import java.awt.Insets;
import javax.swing.JButton;

public class PantallaLogin extends JPanel {
	private JTextField textoUsuario;
	private JPasswordField textoContrasena;
	private Ventana ventana;
	private JTextField campoCorreoLogin;
	private JPasswordField campoContraseñaLogin;
	public PantallaLogin (Ventana v) {
		this.ventana=v;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 197, 205, 197, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 36, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("RecurSHOT");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 2;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel labelCorreoLogin = new JLabel("Correo electrónico");
		labelCorreoLogin.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_labelCorreoLogin = new GridBagConstraints();
		gbc_labelCorreoLogin.fill = GridBagConstraints.HORIZONTAL;
		gbc_labelCorreoLogin.insets = new Insets(0, 0, 5, 5);
		gbc_labelCorreoLogin.gridx = 1;
		gbc_labelCorreoLogin.gridy = 4;
		add(labelCorreoLogin, gbc_labelCorreoLogin);
		
		campoCorreoLogin = new JTextField();
		GridBagConstraints gbc_campoCorreoLogin = new GridBagConstraints();
		gbc_campoCorreoLogin.insets = new Insets(0, 0, 5, 5);
		gbc_campoCorreoLogin.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoCorreoLogin.gridx = 2;
		gbc_campoCorreoLogin.gridy = 4;
		add(campoCorreoLogin, gbc_campoCorreoLogin);
		campoCorreoLogin.setColumns(10);
		
		JLabel labelContraseña = new JLabel("Contraseña");
		labelContraseña.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_labelContraseña = new GridBagConstraints();
		gbc_labelContraseña.anchor = GridBagConstraints.WEST;
		gbc_labelContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_labelContraseña.gridx = 1;
		gbc_labelContraseña.gridy = 5;
		add(labelContraseña, gbc_labelContraseña);
		
		campoContraseñaLogin = new JPasswordField();
		GridBagConstraints gbc_campoContraseñaLogin = new GridBagConstraints();
		gbc_campoContraseñaLogin.insets = new Insets(0, 0, 5, 5);
		gbc_campoContraseñaLogin.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoContraseñaLogin.gridx = 2;
		gbc_campoContraseñaLogin.gridy = 5;
		add(campoContraseñaLogin, gbc_campoContraseñaLogin);
		
		JButton btnRecuperarContrasea = new JButton("Recuperar contraseña");
		btnRecuperarContrasea.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_btnRecuperarContrasea = new GridBagConstraints();
		gbc_btnRecuperarContrasea.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnRecuperarContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_btnRecuperarContrasea.gridx = 1;
		gbc_btnRecuperarContrasea.gridy = 7;
		add(btnRecuperarContrasea, gbc_btnRecuperarContrasea);
		
		JButton buttonIniciarSesion = new JButton("Iniciar sesión");
		buttonIniciarSesion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_buttonIniciarSesion = new GridBagConstraints();
		gbc_buttonIniciarSesion.fill = GridBagConstraints.HORIZONTAL;
		gbc_buttonIniciarSesion.insets = new Insets(0, 0, 5, 5);
		gbc_buttonIniciarSesion.gridx = 2;
		gbc_buttonIniciarSesion.gridy = 7;
		add(buttonIniciarSesion, gbc_buttonIniciarSesion);
		
	}
}
