package aVista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import aModelo.Automovil;
import aOperaciones.Operaciones;

import javax.swing.JLabel;
import java.awt.Font;
import java.text.DecimalFormat;

public class VentaConsultaAuto extends JFrame {

	private JPanel contentPane;
	private JLabel lblPrecio;
	private JLabel lblColor;
	private JLabel lblPotencia;
	private JLabel lblCilindros;
	private JLabel lblVersion;
	private Operaciones misOperaciones;
	private VentanaCatalogo ventanaCatalogo;
	private Automovil autoSeleccionado;

	

	public VentaConsultaAuto(Operaciones misOperaciones, VentanaCatalogo ventanaCatalogo, Automovil autoSeleccionado) {
		this.misOperaciones = misOperaciones;
		this.ventanaCatalogo = ventanaCatalogo;
		this.autoSeleccionado = autoSeleccionado;
		setTitle("CONSULTA");
		iniciarComponentes();
		mostrarInformacionAuto(autoSeleccionado);
		
	}



	



	private void iniciarComponentes() {
		setBounds(100, 100, 271, 261);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConsultaAutos = new JLabel("Especificaciones del Auto");
		lblConsultaAutos.setFont(new Font("Arial", Font.PLAIN, 20));
		lblConsultaAutos.setBounds(10, 11, 235, 24);
		contentPane.add(lblConsultaAutos);
		
		JLabel lblVersionAuto = new JLabel("Versión:");
		lblVersionAuto.setFont(new Font("Arial", Font.PLAIN, 13));
		lblVersionAuto.setBounds(20, 52, 55, 24);
		contentPane.add(lblVersionAuto);
		
		JLabel lblCilindrosAuto = new JLabel("Cilindros:");
		lblCilindrosAuto.setFont(new Font("Arial", Font.PLAIN, 13));
		lblCilindrosAuto.setBounds(20, 87, 55, 24);
		contentPane.add(lblCilindrosAuto);
		
		JLabel lblPotenciaAuto = new JLabel("Potencia:");
		lblPotenciaAuto.setFont(new Font("Arial", Font.PLAIN, 13));
		lblPotenciaAuto.setBounds(20, 120, 55, 24);
		contentPane.add(lblPotenciaAuto);
		
		JLabel lblColorAuto = new JLabel("Color:");
		lblColorAuto.setFont(new Font("Arial", Font.PLAIN, 13));
		lblColorAuto.setBounds(20, 155, 55, 24);
		contentPane.add(lblColorAuto);
		
		JLabel lblPrecioAuto = new JLabel("Precio:");
		lblPrecioAuto.setFont(new Font("Arial", Font.PLAIN, 13));
		lblPrecioAuto.setBounds(20, 188, 55, 24);
		contentPane.add(lblPrecioAuto);
		
		lblVersion = new JLabel("");
		lblVersion.setFont(new Font("Arial", Font.PLAIN, 13));
		lblVersion.setBounds(73, 52, 172, 24);
		contentPane.add(lblVersion);
		
		lblCilindros = new JLabel("");
		lblCilindros.setFont(new Font("Arial", Font.PLAIN, 13));
		lblCilindros.setBounds(83, 87, 162, 24);
		contentPane.add(lblCilindros);
		
		lblPotencia = new JLabel("");
		lblPotencia.setFont(new Font("Arial", Font.PLAIN, 13));
		lblPotencia.setBounds(83, 120, 162, 24);
		contentPane.add(lblPotencia);
		
		lblColor = new JLabel("");
		lblColor.setFont(new Font("Arial", Font.PLAIN, 13));
		lblColor.setBounds(62, 155, 183, 24);
		contentPane.add(lblColor);
		
		lblPrecio = new JLabel("");
		lblPrecio.setFont(new Font("Arial", Font.PLAIN, 13));
		lblPrecio.setBounds(72, 188, 173, 24);
		contentPane.add(lblPrecio);
		
	}
	
	private void mostrarInformacionAuto(Automovil autoSeleccionado) {
		// TODO Auto-generated method stub
		lblVersion.setText(autoSeleccionado.getVersion());
	    lblCilindros.setText(String.valueOf(autoSeleccionado.getCilindros()));
	    lblPotencia.setText(autoSeleccionado.getPotencia());
	    lblColor.setText(autoSeleccionado.getColor());
	    //lblPrecio.setText(String.valueOf(autoSeleccionado.getPrecio()));
	    DecimalFormat decimalFormat = new DecimalFormat("$#,##0.00");
	    lblPrecio.setText(decimalFormat.format(autoSeleccionado.getPrecio()));
	}

}
