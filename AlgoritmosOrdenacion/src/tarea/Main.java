package tarea;

public class Main {

	public static void main(String[] args) {
		
		Tecnico t1 = new Tecnico("Juan", "Perez", "Lopez", "12345678", 1500, 10, 20);
		Administrativo a1 = new Administrativo("Ana", "Gomez", "Diaz", "87654321", 1200, 300);
		
		System.out.println("Salario Tecnico:" + t1.calcularSalario());
		System.out.println("salario Administrativo: " + a1.calcularSalario());
	}

}
