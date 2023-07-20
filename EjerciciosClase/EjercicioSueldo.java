package ejercicios_clase;

public class EjercicioSueldo {

    public Sueldo calcularSueldoBruto(double horasTrabajadas, double valorHoraNormal, double valorHoraExtra) {
        double sueldoBruto;

        if (horasTrabajadas > 8) {
            sueldoBruto = (valorHoraNormal * 8) + ((horasTrabajadas - 8) * valorHoraExtra);
        } else {
            sueldoBruto = horasTrabajadas * valorHoraNormal;
        }

        return new Sueldo(sueldoBruto);
    }
    
    public void calcularSueldoNeto(Sueldo sueldo) {
    	double sueldoBruto = sueldo.getSueldoBruto();
    	double sueldoNeto;
    	
    	if (sueldoBruto < 2000) {
            sueldoNeto = sueldoBruto - (sueldoBruto * 0.16);
        } else {
            sueldoNeto = sueldoBruto - (sueldoBruto * 0.18);
        }
    	
    	sueldo.setSueldoNeto(sueldoNeto);
    }

    static class Sueldo {
        private double sueldoBruto;
        private double sueldoNeto;

        public Sueldo(double sueldoBruto) {
            this.sueldoBruto = sueldoBruto;
        }

        public double getSueldoBruto() {
            return sueldoBruto;
        }
        
        public double getSueldoNeto() {
            return sueldoNeto;
        }

        public void setSueldoNeto(double sueldoNeto) {
            this.sueldoNeto = sueldoNeto;
        }
    }
}

