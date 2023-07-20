package graficos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	double numero1;
	double numero2;
	double resultado;
	String operacion;
	/**
	 * 
	 */
	private JPanel contentPane;
	private JTextField txtPantalla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setTitle("Calculadora Funval");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 236, 316);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		txtPantalla = new JTextField();
		txtPantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPantalla.setFont(new Font("Arial", Font.BOLD, 18));
		txtPantalla.setBounds(10, 11, 152, 43);
		contentPane.add(txtPantalla);
		txtPantalla.setColumns(10);
		
		JButton btnSum = new JButton("+");
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Suma
				numero1 = Double.parseDouble(txtPantalla.getText());
				txtPantalla.setText("");;
				operacion = "+";
			}
		});
		btnSum.setForeground(new Color(255, 69, 0));
		btnSum.setFont(new Font("Arial", Font.BOLD, 15));
		btnSum.setBounds(172, 65, 43, 43);
		contentPane.add(btnSum);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Numero 9
				String IngreseNumero = txtPantalla.getText() + btn9.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn9.setFont(new Font("Arial", Font.BOLD, 17));
		btn9.setBounds(119, 65, 43, 43);
		contentPane.add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Numero 8
				String IngreseNumero = txtPantalla.getText() + btn8.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn8.setFont(new Font("Arial", Font.BOLD, 17));
		btn8.setBounds(66, 65, 43, 43);
		contentPane.add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Numero 7
				String IngreseNumero = txtPantalla.getText() + btn7.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn7.setFont(new Font("Arial", Font.BOLD, 17));
		btn7.setBounds(12, 65, 43, 43);
		contentPane.add(btn7);
		
		JButton btnRest = new JButton("-");
		btnRest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Resta
				numero1 = Double.parseDouble(txtPantalla.getText());
				txtPantalla.setText("");;
				operacion = "-";
			}
		});
		btnRest.setForeground(new Color(255, 0, 0));
		btnRest.setFont(new Font("Arial", Font.BOLD, 17));
		btnRest.setBounds(172, 119, 43, 43);
		contentPane.add(btnRest);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Numero 6
				String IngreseNumero = txtPantalla.getText() + btn6.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn6.setFont(new Font("Arial", Font.BOLD, 17));
		btn6.setBounds(119, 119, 43, 43);
		contentPane.add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Numero 5
				String IngreseNumero = txtPantalla.getText() + btn5.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn5.setFont(new Font("Arial", Font.BOLD, 17));
		btn5.setBounds(66, 119, 43, 43);
		contentPane.add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Numero 4
				String IngreseNumero = txtPantalla.getText() + btn4.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn4.setFont(new Font("Arial", Font.BOLD, 17));
		btn4.setBounds(12, 119, 43, 43);
		contentPane.add(btn4);
		
		JButton btnMult = new JButton("x");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Multiplicacion
				numero1 = Double.parseDouble(txtPantalla.getText());
				txtPantalla.setText("");;
				operacion = "x";
			}
		});
		btnMult.setForeground(new Color(255, 0, 0));
		btnMult.setFont(new Font("Arial", Font.BOLD, 17));
		btnMult.setBounds(172, 173, 43, 43);
		contentPane.add(btnMult);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Numero 3
				String IngreseNumero = txtPantalla.getText() + btn3.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn3.setFont(new Font("Arial", Font.BOLD, 17));
		btn3.setBounds(119, 173, 43, 43);
		contentPane.add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Numero 2
				String IngreseNumero = txtPantalla.getText() + btn2.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn2.setFont(new Font("Arial", Font.BOLD, 17));
		btn2.setBounds(66, 173, 43, 43);
		contentPane.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Numero 1
				String IngreseNumero = txtPantalla.getText() + btn1.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn1.setFont(new Font("Arial", Font.BOLD, 17));
		btn1.setBounds(12, 173, 43, 43);
		contentPane.add(btn1);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Division
				numero1 = Double.parseDouble(txtPantalla.getText());
				txtPantalla.setText("");;
				operacion = "/";
			}
		});
		btnDiv.setForeground(new Color(255, 0, 0));
		btnDiv.setFont(new Font("Arial", Font.BOLD, 17));
		btnDiv.setBounds(172, 227, 43, 43);
		contentPane.add(btnDiv);
		
		JButton btnPoint = new JButton(".");
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Point
				String IngreseNumero = txtPantalla.getText() + btnPoint.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btnPoint.setFont(new Font("Arial", Font.BOLD, 18));
		btnPoint.setBounds(119, 227, 43, 43);
		contentPane.add(btnPoint);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Numero 0
				String IngreseNumero = txtPantalla.getText() + btn0.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn0.setFont(new Font("Arial", Font.BOLD, 17));
		btn0.setBounds(66, 227, 43, 43);
		contentPane.add(btn0);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Igualdad
				String seleccionar;
				numero2 = Double.parseDouble(txtPantalla.getText());
				
				if(operacion == "+") {
					resultado = numero1 + numero2;
					seleccionar = String.format("%.2f",resultado);
					txtPantalla.setText(seleccionar);
				}
				else if(operacion == "-") {
					resultado = numero1 - numero2;
					seleccionar = String.format("%.2f",resultado);
					txtPantalla.setText(seleccionar);
				}
				else if(operacion == "x") {
					resultado = numero1 * numero2;
					seleccionar = String.format("%.2f",resultado);
					txtPantalla.setText(seleccionar);
				}
				else if(operacion == "/") {
					resultado = numero1 / numero2;
					seleccionar = String.format("%.2f",resultado);
					txtPantalla.setText(seleccionar);
				}
			}
		});
		btnIgual.setForeground(new Color(255, 0, 0));
		btnIgual.setFont(new Font("Arial", Font.BOLD, 15));
		btnIgual.setBounds(12, 227, 43, 43);
		contentPane.add(btnIgual);
		
		JButton btnC = new JButton("c");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Cancel
				txtPantalla.setText("");
			}
		});
		btnC.setForeground(new Color(255, 0, 0));
		btnC.setFont(new Font("Arial", Font.BOLD, 17));
		btnC.setBounds(172, 11, 43, 43);
		contentPane.add(btnC);
	}
}