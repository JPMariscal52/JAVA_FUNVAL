package aVista;

import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import aModelo.Automovil;
import aOperaciones.Operaciones;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class VentanaCatalogo extends JFrame implements ActionListener {

	private static ArrayList<Automovil> listaAutos;
	private ArrayList<Automovil> listaAutosFiltrados;//actualizado
	private static Automovil auto;
	private JPanel contentPane;
	private JTable tablaAutos;
	private JTextField txtBuscar;
	private JLabel lblModelo;
	private JLabel lblMarca;
	private JLabel lblNombre;
	private JButton btnAgregar;
	private JButton btnConsulta;
	private DefaultTableModel model;
	private String direccionImagenSeleccionada;
	
	Operaciones misOperaciones;
	private JLabel lblImagenAuto;

	

	public VentanaCatalogo(Operaciones misOperaciones) {
		
		this.misOperaciones = misOperaciones;
		
		setTitle("CATALOGO DE AUTOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		iniciarComponentes();
		
	}
	
	private void iniciarComponentes() {
		
		
		
		setBounds(100, 100, 563, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tablaAutos = new JTable();
		tablaAutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    tablaAutos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
	        @Override
	        public void valueChanged(ListSelectionEvent e) {
	            mostrarDatosPantalla();
	        }
	    });
		
		model = new DefaultTableModel();
		tablaAutos.setModel(model);
		model.addColumn("Nombre");

	    JScrollPane scrollPane = new JScrollPane(tablaAutos);
	    scrollPane.setBounds(10, 56, 153, 276); 
	    contentPane.add(scrollPane);
	    
	    
	    //Etiqueta de imagen "Imagen Auto"
	    lblImagenAuto = new JLabel();
	    lblImagenAuto.setBounds(173, 48, 364, 210);
	    ImageIcon imagen = new ImageIcon("Imagenes/autos.jpg");
	    Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblImagenAuto.getWidth(), lblImagenAuto.getHeight(), Image.SCALE_DEFAULT));
	    lblImagenAuto.setIcon(icono);
	    contentPane.add(lblImagenAuto);
	    
	    //Etiqueta titulo "Funval Cars"
	    JLabel lblNewLabel = new JLabel("Funval Cars");
	    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 22));
	    lblNewLabel.setBounds(228, 11, 231, 37);
	    contentPane.add(lblNewLabel);
	    
	    //Boton "Agregar"
	    btnAgregar = new JButton("Agregar Auto");
	    btnAgregar.setFont(new Font("Arial", Font.PLAIN, 13));
	    btnAgregar.setBounds(208, 309, 131, 23);
	    btnAgregar.addActionListener(this);
	    contentPane.add(btnAgregar);
	    
	    //Boton "Consultar"
	    btnConsulta = new JButton("Consulta Auto");
	    btnConsulta.setFont(new Font("Arial", Font.PLAIN, 13));
	    btnConsulta.setBounds(376, 309, 131, 23);
	    btnConsulta.addActionListener(this);
	    contentPane.add(btnConsulta);
	    
	    //Etiquetas "Nombre", "Marca" y "Modelo"
	    JLabel lblNombreAuto = new JLabel("Auto:");
	    lblNombreAuto.setFont(new Font("Arial", Font.PLAIN, 13));
	    lblNombreAuto.setBounds(173, 275, 37, 23);
	    contentPane.add(lblNombreAuto);
	    
	    JLabel lblMarcaAuto = new JLabel("Marca:");
	    lblMarcaAuto.setFont(new Font("Arial", Font.PLAIN, 13));
	    lblMarcaAuto.setBounds(286, 275, 51, 23);
	    contentPane.add(lblMarcaAuto);
	    
	    JLabel lblModeloAuto = new JLabel("Modelo:");
	    lblModeloAuto.setFont(new Font("Arial", Font.PLAIN, 13));
	    lblModeloAuto.setBounds(436, 275, 51, 23);
	    contentPane.add(lblModeloAuto);
	    
	    //Campo de texto "Buscar"
	    txtBuscar = new JTextField();
	    txtBuscar.setBounds(10, 34, 153, 20);
	    txtBuscar.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filtrarAutos();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filtrarAutos();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filtrarAutos();
            }
        });
	    contentPane.add(txtBuscar);
	    txtBuscar.setColumns(10);
	    
	    //Etiquetas de retorno "Nombre", "Marca" y "Modelo"
	    lblNombre = new JLabel("");
	    lblNombre.setFont(new Font("Arial", Font.PLAIN, 13));
	    lblNombre.setBounds(208, 275, 75, 23);
	    contentPane.add(lblNombre);
	    
	    lblMarca = new JLabel("");
	    lblMarca.setFont(new Font("Arial", Font.PLAIN, 13));
	    lblMarca.setBounds(325, 275, 109, 23);
	    contentPane.add(lblMarca);
	    
	    lblModelo = new JLabel("");
	    lblModelo.setFont(new Font("Arial", Font.PLAIN, 13));
	    lblModelo.setBounds(486, 275, 61, 23);
	    contentPane.add(lblModelo);
	    
	    JLabel lblBuscador = new JLabel("Buscador:");
	    lblBuscador.setFont(new Font("Arial", Font.PLAIN, 14));
	    lblBuscador.setBounds(10, 11, 109, 23);
	    contentPane.add(lblBuscador);
	    
	    
	    agregarAutosPredeterminados();
	    
	    imprimirListaTabla();
	}
	
	 private void filtrarAutos() {

	        String filtro = txtBuscar.getText().trim().toLowerCase();
	        ArrayList<Automovil> listaFiltrada = new ArrayList<>();

	        if (!filtro.isEmpty()) {
	            for (Automovil auto : misOperaciones.getListaAutos()) {
	                if (auto.getNombre().toLowerCase().contains(filtro)) {
	                    listaFiltrada.add(auto);
	                }
	            }
	        } else {
	            listaFiltrada.addAll(misOperaciones.getListaAutos());
	        }

	        actualizarTabla(listaFiltrada);
	    }
	 
	 private void actualizarTabla(ArrayList<Automovil> listaFiltrada) {
	        DefaultTableModel model = (DefaultTableModel) tablaAutos.getModel();
	        model.setRowCount(0);

	        for (Automovil auto : listaFiltrada) {
	            Object[] fila = new Object[1];
	            fila[0] = auto.getNombre();
	            model.addRow(fila);
	        }
	    }
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAgregar) {
			VentanaAgregarAuto ventanaAgregar = new VentanaAgregarAuto(misOperaciones,this);
			ventanaAgregar.setVisible(true);
		}
		else if(e.getSource()==btnConsulta) {
			 int indiceauto = tablaAutos.getSelectedRow();
		        if (indiceauto >= 0) {
		            Automovil autoSeleccionado = misOperaciones.getListaAutos().get(indiceauto);
		            VentaConsultaAuto ventanaConsulta = new VentaConsultaAuto(misOperaciones, this, autoSeleccionado);
			ventanaConsulta.setVisible(true);
		}
		}        
	}

	private void mostrarDatosPantalla() {

		ArrayList<Automovil> listaAutos = misOperaciones.getListaAutos();
		int indiceauto = tablaAutos.getSelectedRow();
        if (indiceauto >= 0) {
        	 String nombre = listaAutos.get(indiceauto).getNombre();
             String marca = listaAutos.get(indiceauto).getMarca();
             int modelo = listaAutos.get(indiceauto).getModelo();
             String direccion = listaAutos.get(indiceauto).getDireccion();
             lblNombre.setText(nombre);
             lblMarca.setText(marca);
             lblModelo.setText(String.valueOf(modelo));
             direccionImagenSeleccionada = direccion;
             ImageIcon imagen = new ImageIcon(direccion);
             Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblImagenAuto.getWidth(), lblImagenAuto.getHeight(), Image.SCALE_DEFAULT));
             lblImagenAuto.setIcon(icono);
        }
	}

	public void imprimirListaTabla() {

		DefaultTableModel model = (DefaultTableModel) tablaAutos.getModel();
	    model.setRowCount(0);
		
		ArrayList<Automovil> listaAutos = misOperaciones.getListaAutos();
		for(Automovil auto: listaAutos) {
			Object[] fila = new Object [1];
			fila[0] = auto.getNombre();
			model.addRow(fila);
			}
		
	}

	private void agregarAutosPredeterminados() {
		
		misOperaciones.llenarTablaAutos("Vento", "Volkswagen", 2018, "ConfortLine", 4, "120hp", "Plateado", 290000, "Imagenes/vento.jpg");
		misOperaciones.llenarTablaAutos("Sonic", "Chevrolet", 2012, "LTZ", 4, "110hp", "Blanco", 65500, "Imagenes/sonic.jpg");
		misOperaciones.llenarTablaAutos("Yaris", "Toyota", 2017, "Confort", 4, "120hp", "Plateado", 310500, "Imagenes/yaris.jpg");
		misOperaciones.llenarTablaAutos("Rio", "Kia", 2023, "HighLine", 4, "115hp", "Azul", 350000, "Imagenes/rio.jpg");
		misOperaciones.llenarTablaAutos("Fiesta", "Ford", 2015, "Basic", 4, "105hp", "Rojo", 18000, "Imagenes/fiesta.jpg");
		misOperaciones.llenarTablaAutos("Tiggo 8", "Chirey", 2023, "ProTurbo", 4, "135hp", "Negro", 365000, "Imagenes/tiggo.jpg");
		misOperaciones.llenarTablaAutos("Jetta", "Volkswagen", 2021, "MediumLine", 5, "130hp", "Azul", 285000, "Imagenes/jetta.jpg");
		misOperaciones.llenarTablaAutos("Forte", "Kia", 2020, "HighLine", 4, "125hp", "Naranja", 270000, "Imagenes/forte.jpg");
		misOperaciones.llenarTablaAutos("Aveo", "Chevrolet", 2019, "LS", 4, "100hp", "Azul Marino", 235500, "Imagenes/aveo.jpg");
		misOperaciones.llenarTablaAutos("Soul", "Kia", 2018, "MediumLine", 4, "125hp", "Rojo", 265800, "Imagenes/soul.jpg");
		misOperaciones.llenarTablaAutos("Sei3", "Jac", 2019, "StdPro", 4, "115hp", "Gris", 289000, "Imagenes/sei.jpg");
		misOperaciones.llenarTablaAutos("Versa", "Nissan", 2021, "HighLine", 4, "125hp", "Rojo", 276900, "Imagenes/versa.jpg");
		misOperaciones.llenarTablaAutos("Focus", "Ford", 2017, "Medium", 4, "120hp", "Gris", 180000, "Imagenes/focus.jpg");
		misOperaciones.llenarTablaAutos("Polo", "Volkswagen", 2019, "ConfortLine", 4, "125hp", "Rojo", 255000, "Imagenes/polo.jpg");
		misOperaciones.llenarTablaAutos("Cruze", "Chevrolet", 2020, "LTZ", 4, "135hp", "Negro", 325800, "Imagenes/cruze.jpg");
		
	}
}

	

	
