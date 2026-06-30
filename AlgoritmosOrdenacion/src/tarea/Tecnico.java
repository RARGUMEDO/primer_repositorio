package tarea;

public class Tecnico extends Empleado {

    private int horasExtra;
    private double pagoHoraExtra;

    public Tecnico(String nombre, String apePat, String apeMat, String dni,
                   double salarioBase, int horasExtra, double pagoHoraExtra) {

        super(nombre, apePat, apeMat, dni, salarioBase);
        this.horasExtra = horasExtra;
        this.pagoHoraExtra = pagoHoraExtra;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (horasExtra * pagoHoraExtra);
    }
}
