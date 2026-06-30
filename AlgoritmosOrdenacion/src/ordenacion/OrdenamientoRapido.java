package ordenacion;

import java.util.ArrayList;
import java.util.Scanner;

public class OrdenamientoRapido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		imprimeTexto("Ingresa la cantidad de elementos de la lista: ");
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<Integer> lista = new ArrayList<Integer>();
		for(int i=1; i<=n;i++) {
			imprimeTexto("Ingresa el valor ["+i+"] ");
			lista.add(sc.nextInt());
			sc.nextLine();
		}
		
		//llamado al metodo de ordenacion rapida
		lista = ordenaQuikSort(lista,0,lista.size()-1);
		
		for(int i=0;i<lista.size();i++) {
			imprimeTexto("Lista ["+(i+1)+"] "+lista.get(i));
		}

	}

	private static ArrayList<Integer> ordenaQuikSort(ArrayList<Integer> lista, int izquierda, int derecha) {
		if(izquierda<derecha){
			int pivote = particion(lista,izquierda,derecha);
			ordenaQuikSort(lista, izquierda, pivote-1);
			ordenaQuikSort(lista, pivote+1, derecha);
		}
		return lista;
	}

	private static int particion(ArrayList<Integer> lista, int izquierda, int derecha) {
		int pivot = lista.get(derecha);
		int i = izquierda-1;
		
		for(int j=izquierda;j<derecha;j++) {
			if(lista.get(j)<=pivot) {
				i++;
				intercambioValores(lista,i,j);
			}
		}
		intercambioValores(lista, i+1, derecha);
		return i+1;
	}

	private static void intercambioValores(ArrayList<Integer> lista, int i, int j) {
		int temp = lista.get(i);
		lista.set(i, lista.get(j));
		lista.set(j, temp);
	}

	private static void imprimeTexto(String texto) {
		System.out.println(texto);
	}

}
