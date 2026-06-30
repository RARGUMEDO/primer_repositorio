package tarea;

public class Empleado {
	protected String nombre;
	protected String apePat;
	protected String apeMat;
	protected String dni;
	protected double salarioBase;
	
	public Empleado(String nombre, String apePat, String apeMat, String dni, double salarioBase) {
		this.nombre = nombre;
		this.apePat = apePat;
		this.apeMat = apeMat;
		this.dni = dni;
		this.salarioBase = salarioBase;
	}
		public double calcularSalario() {
			return salarioBase;
		}
}
