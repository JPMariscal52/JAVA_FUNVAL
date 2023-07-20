package aVista;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import aModelo.Automovil;
import aOperaciones.Operaciones;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;

public class VentanaAgregarAuto extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtMarca;
	private JTextField txtModelo;
	private JTextField txtVersion;
	private JTextField txtCilindros;
	private JTextField txtPotencia;
	private JTextField txtColor;
	private JTextField txtPrecio;
	private JButton btnAgregar;
	private Operaciones misOperaciones;
	private VentanaCatalogo ventanaCatalogo;

	
	

	
	public VentanaAgregarAuto(Operaciones misOperaciones, VentanaCatalogo ventanaCatalogo) {
        this.misOperaciones = misOperaciones;
        this.ventanaCatalogo = ventanaCatalogo;
		setTitle("AGREGAR");
		iniciarComponentes();
		
		
	}

	private void iniciarComponentes() {

		setBounds(100, 100, 372, 263);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 0, 353, 226);
		contentPane.add(contentPane_1);
		
		//Etiquetas de texto "nombre, marca, modelo, version, cilindros, potencia, color y precio".
		JLabel lblConsultaAutos = new JLabel("Agregar Auto");
		lblConsultaAutos.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsultaAutos.setFont(new Font("Arial", Font.PLAIN, 20));
		lblConsultaAutos.setBounds(64, 11, 235, 24);
		contentPane_1.add(lblConsultaAutos);
		
		//Etiquetas de "nombre, marca, modelo, version, cilindros, potencia, color y precio".
		JLabel lblVersionAuto = new JLabel("Versión:");
		lblVersionAuto.setFont(new Font("Arial", Font.PLAIN, 13));
		lblVersionAuto.setBounds(10, 149, 55, 24);
		contentPane_1.add(lblVersionAuto);
		
		JLabel lblCilindrosAuto = new JLabel("Cilindros:");
		lblCilindrosAuto.setFont(new Font("Arial", Font.PLAIN, 13));
		lblCilindrosAuto.setBounds(184, 46, 55, 24);
		contentPane_1.add(lblCilindrosAuto);
		
		JLabel lblPotenciaAuto = new JLabel("Potencia:");
		lblPotenciaAuto.setFont(new Font("Arial", Font.PLAIN, 13));
		lblPotenciaAuto.setBounds(184, 79, 55, 24);
		contentPane_1.add(lblPotenciaAuto);
		
		JLabel lblColorAuto = new JLabel("Color:");
		lblColorAuto.setFont(new Font("Arial", Font.PLAIN, 13));
		lblColorAuto.setBounds(184, 114, 55, 24);
		contentPane_1.add(lblColorAuto);
		
		JLabel lblPrecioAuto = new JLabel("Precio:");
		lblPrecioAuto.setFont(new Font("Arial", Font.PLAIN, 13));
		lblPrecioAuto.setBounds(184, 149, 55, 24);
		contentPane_1.add(lblPrecioAuto);
		
		JLabel lblNombreAuto = new JLabel("Nombre:");
		lblNombreAuto.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNombreAuto.setBounds(10, 46, 55, 24);
		contentPane_1.add(lblNombreAuto);
		
		JLabel lblCilindrosAuto_1 = new JLabel("Marca:");
		lblCilindrosAuto_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblCilindrosAuto_1.setBounds(10, 79, 55, 24);
		contentPane_1.add(lblCilindrosAuto_1);
		
		JLabel lblPotenciaAuto_1 = new JLabel("Modelo:");
		lblPotenciaAuto_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblPotenciaAuto_1.setBounds(10, 114, 55, 24);
		contentPane_1.add(lblPotenciaAuto_1);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Arial", Font.PLAIN, 13));
		btnAgregar.setBounds(129, 184, 99, 26);
		btnAgregar.addActionListener(this);
		contentPane_1.add(btnAgregar);
		
		//Campos de texto "nombre, marca, modelo, version, cilindros, potencia, color y precio".
		txtNombre = new JTextField();
		txtNombre.setBounds(64, 48, 110, 20);
		contentPane_1.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtMarca = new JTextField();
		txtMarca.setColumns(10);
		txtMarca.setBounds(75, 81, 99, 20);
		contentPane_1.add(txtMarca);
		
		txtModelo = new JTextField();
		txtModelo.setColumns(10);
		txtModelo.setBounds(75, 114, 99, 20);
		contentPane_1.add(txtModelo);
		
		txtVersion = new JTextField();
		txtVersion.setColumns(10);
		txtVersion.setBounds(64, 149, 110, 20);
		contentPane_1.add(txtVersion);
		
		txtCilindros = new JTextField();
		txtCilindros.setColumns(10);
		txtCilindros.setBounds(244, 48, 100, 20);
		contentPane_1.add(txtCilindros);
		
		txtPotencia = new JTextField();
		txtPotencia.setColumns(10);
		txtPotencia.setBounds(245, 81, 99, 20);
		contentPane_1.add(txtPotencia);
		
		txtColor = new JTextField();
		txtColor.setColumns(10);
		txtColor.setBounds(234, 114, 110, 20);
		contentPane_1.add(txtColor);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(234, 149, 110, 20);
		contentPane_1.add(txtPrecio);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAgregar) {
			agregarAutoLista();
			ventanaCatalogo.imprimirListaTabla();
		}
		
	}

	private void agregarAutoLista() {
		
		try {
			
			String nombre = txtNombre.getText();
			String marca = txtMarca.getText();
			int modelo = Integer.parseInt(txtModelo.getText());
			String version = txtVersion.getText();
			int cilindros = Integer.parseInt(txtCilindros.getText());
			String potencia = txtPotencia.getText();
			String color = txtColor.getText();
			int precio = Integer.parseInt(txtPrecio.getText());
			String direccion = "Imagenes/autos.jpg";
			
			misOperaciones.llenarTablaAutos(nombre, marca, modelo, version, cilindros, potencia, color, precio, direccion);
			
			txtNombre.setText("");
			txtMarca.setText("");
			txtModelo.setText("");
			txtVersion.setText("");
			txtCilindros.setText("");
			txtPotencia.setText("");
			txtColor.setText("");
			txtPrecio.setText("");
			
			
			
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "El campo 'Modelo', 'Cilindros' y 'Precio' solo acepta valores numericos");
		}
		
	}
}


