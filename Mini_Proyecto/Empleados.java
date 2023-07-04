package proyectos_java;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Empleados {

	public static void main(String[] args) {
		
		EdicionEmpleadosDos empleado[] = new EdicionEmpleadosDos[10];
			
			Scanner teclado = new Scanner(System.in);
			
			int opcion = 0, sueldo = 0, plaza = 0;
			String nombre = " ";

			JOptionPane.showMessageDialog(null, "Bienvenido al programa de gestion de empleados");
			opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la opcion deseada"+
																"\n1.-Contratar Empleados"+
																"\n2.-Despedir Empleados"+
																"\n3.-Aumentar Salario"+
																"\n4.-Salir"));
			
			if(opcion >= 1 && opcion <= 4) {
				while(opcion != 4 && opcion > 0) {
					
					switch(opcion) {
					
					case 1:
						nombre = JOptionPane.showInputDialog("Contratar empleados"+
															"\nIngrese el nombre del empleado");
						sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sueldo del empleado"));
						plaza = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la plaza (0 al 9)"));
						empleado[plaza] = new EdicionEmpleadosDos(nombre, sueldo);

						break;
					case 2:
						nombre = JOptionPane.showInputDialog("Despedir empleado"+
															"\nIngrese el nombre del empleado");
						
						for(int i = 0;i<empleado.length;i++) {
							if(empleado[i] != null) {
								if(empleado[i].getNombre().equals(nombre)){
									nombre = "";
									sueldo = 0;
									empleado[i]= new EdicionEmpleadosDos(nombre, sueldo);
								}
							}
							
						}
						
						break;
					case 3:
						JOptionPane.showMessageDialog(null, "Listar empleados"+"\nSe imprimirá en consola");
						for(int i=0;i<empleado.length;i++) {
							if (empleado[i] != null) {
								System.out.println(i+".-Empleado: "+empleado[i].getNombre()+" Sueldo: $"+empleado[i].getSueldo());
						    }
							if (empleado[i] == null) {
								System.out.println(i+".-Plaza Libre");
						    }
						}
						break;
					case 4:
						System.out.println("Salir");
						break;
					default:
						System.out.println("Ingresa un opcion valida");
						break;
					
					}//------Final Switch
					opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la opcion deseada"+
																			"\n1.-Contratar Empleados"+
																			"\n2.-Despedir Empleados"+
																			"\n3.-Aumentar Salario"+
																			"\n4.-Salir"));
					
				}//------Final While
				
			}//------Final if
			else {
				JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
			}//------Final Else

			teclado.close();
		}//-------Final Main

	}//-------Final Clase