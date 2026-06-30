package ordenacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Ordenamiento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			imprimeTexto("Ingrese el numero de elementos registrar:");
			int n = sc.nextInt();
			sc.nextLine();
			ArrayList<Integer> lista = new ArrayList<Integer>();
			
			for(int i=1; i<= n; i++) {
				try {
					imprimeTexto("Ingrese el valor["+i+"] ");
					lista.add(sc.nextInt());
					sc.nextLine();
				}catch(Exception ex) {
					imprimeTexto("Error al ingrear el valor numerico, intente nuevamente");
					sc.nextLine();
					i--;
				}
			}
			
			
			
			boolean selMetodo=true;
			while(selMetodo) {
				imprimeTexto("Seleccione el tipo de ordenacion a probar: ");
				imprimeTexto("1. Ordenacion por burbuja");
				imprimeTexto("2. Ordenacion por inserción");
				imprimeTexto("3. Ordenacion por selección");
				int nroOp = sc.nextInt();
				sc.nextLine();
				
				switch (nroOp) {
				case 1:
					lista = ordenaBurbuja(lista);
					selMetodo=false;
					break;
				case 2:
					lista = ordenaPorInsercio(lista);
					selMetodo=false;
					break;
				case 3:
					lista = ordenaPorSeleccion(lista);
					selMetodo=false;
					break;
				case 4:
					lista=ordenaPorMezcla(lista,0;lista.size());
				case 5:
					lista=ordenaPorMonticulo(lista);
				default:
					imprimeTexto("Opcion no aceptada, intente nuevamente");
				}
			}
			
			imprimeTexto("Lista Ordenada:");
			for(int i=0;i<lista.size();i++) {
				imprimeTexto("["+(i+1)+"] "+lista.get(i));
			}
		 imprimeTexto("Salir de ejecucion? (s/n): ");
		 String op = sc.nextLine();
		 if(op.equalsIgnoreCase("S")) {
			 break;
		 }
		}while(true);
		

	}
	
	
	private static ArrayList<Integer> ordenaPorMezcla(ArrayList<Integer> lista,int inicio,int fin) {
		if (inicio < fin) {
            int medio = (inicio + fin) / 2;
            ArrayList<Integer> izq = divideLista(lista,inicio,medio);
            ArrayList<Integer> der = divideLista(lista,medio+1,fin);
            
            izq = ordenaPorMezcla(izq,0,izq.size());
            der = ordenaPorMezcla(der,0,der.size());
            
            lista = mezclaLista(lista,izq,der);
            
		}
		return lista;
	}


	private static ArrayList<Integer> mezclaLista(ArrayList<Integer> lista, ArrayList<Integer> izq,
			ArrayList<Integer> der) {
		 int i = 0, j = 0, k = 0;
		 ArrayList<Integer> newLista = new ArrayList<Integer>();
		// Compara elementos de izq y der y los coloca en el lista resultado
	        while (i < izq.size() && j < der.size()) {
	            if (izq.get(i) <= der.get(j)) {
	                newLista.set(k,izq.get(i));
	                k++;
	                i++;
	            } else {
	            	newLista.set(k,der.get(j));
	            }
	        }
	        
		return null;
	}


	private static ArrayList<Integer> divideLista(ArrayList<Integer> lista, int inicio, int fin) {
		ArrayList<Integer> newLista = new ArrayList<Integer>();
		for(int i=inicio;i<fin;i++) {
			newLista.add(lista.get(i));
		}
		return newLista;
	}


	private static ArrayList<Integer> ordenaPorMonticulo(ArrayList<Integer> lista) {
		// TODO Auto-generated method stub
		return null;
	}


	private static ArrayList<Integer> ordenaPorSeleccion(ArrayList<Integer> lista) {
		//Algoritmo de ordenamiento por seleccion
		for(int i=0;i<lista.size()-2;i++) {
			
			int posMenor = i;
			
			for(int j=i+1;j<lista.size();j++) {
				
				if(lista.get(j)<lista.get(posMenor)) {
					posMenor = j;
				}
			
			}
			int aux = lista.get(i);
			lista.set(i, lista.get(posMenor));
			lista.set(posMenor,aux);
		}
		return lista;
	}


	private static ArrayList<Integer> ordenaPorInsercio(ArrayList<Integer> lista) {
		//Algortimo de ordenacion de Insercion
		 for (int i = 1; i <= lista.size(); i++) {
			 
	            int clave = lista.get(i);// elemento a insertar
	            int j = i - 1;

	            // Desplazar elementos mayores que clave
	            while (j >= 0 && lista.get(j) > clave) {
	            	lista.set(j + 1, lista.get(j));
	                j--;
	            }
	            
	            // Insertar en la posición correcta
	            lista.set(j + 1, clave);
	        }
		 
		//fin algoritmo Insercion
		return lista;
	}


	private static ArrayList<Integer> ordenaBurbuja(ArrayList<Integer> lista) {
		
		//Algortimo de ordenacion de burbuja
		for(int i=0;i<lista.size();i++) {
			for(int j=0;j<lista.size()-1;j++) {
				int valor1 = lista.get(j);
				int valor2 = lista.get(j+1);
				if(valor1>valor2) {
					int aux = valor1;
					valor1=valor2;
					valor2=aux;
				}
				lista.set(j, valor1);
				lista.set(j+1, valor2);
			}
		}
		
		//fin algoritmo burbuja
		return lista;
	}


	public static void imprimeTexto(String texto) {
		System.out.println(texto);
	}

}

