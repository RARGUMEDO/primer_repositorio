package tarea;

public class Administrativo extends Empleado {
	private double bono;
	
	
	public Administrativo(String nombre, String apePat, String apeMat, String dni, double salarioBase, double bono) {
		super(nombre, apePat, apeMat, dni, salarioBase);
		this.bono = bono;
	
	}
	
	@Override
	public double calcularSalario() {
		return salarioBase + bono;
	}

}
