package ordenacion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		imprimeTexto("Ingrese un numero entero: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int valFactorial = factorial(num);
		
		imprimeTexto("En factorial del numero "+num+" es: "+valFactorial);
		
	}

	private static int factorial(int num) {
		int valor = 0;
		if(num>1) {
			valor = num*factorial(num-1);
		}else {
			valor = 1;
		}
		return valor;
	}

	private static void imprimeTexto(String texto) {
		System.out.println(texto);		
	}
}
