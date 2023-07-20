package ejercicios_clase;

import ejercicios_clase.EjercicioSueldo.Sueldo;

public class SueldoTotal {

	public static void main(String[] args) {
		
        double horasTrabajadas = 30.0;
        double valorHoranormal = 72.86;
        double valorHoraextra = 25.65;
        
        EjercicioSueldo trabajador = new EjercicioSueldo();
        
        Sueldo sueldoBruto = trabajador.calcularSueldoBruto(horasTrabajadas, valorHoranormal, valorHoraextra);
        trabajador.calcularSueldoNeto(sueldoBruto);
        
        System.out.println("Tu sueldo neto es de = $" + sueldoBruto.getSueldoNeto());
    }
}
