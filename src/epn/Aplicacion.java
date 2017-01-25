package epn;

public class Aplicacion {

	public static void main(String[] args) {
		ListaCircularDo lista= new ListaCircularDo();
		lista.insertarInicio("prueba 1");
		lista.insertarFinal("prueba 2");
		lista.insertarInicio("prueba 3");
		lista.insertarFinal("prueba 4");
		lista.insertarFinal("prueba 5");
		lista.insertarInicio("prueba 6");
		lista.imprimir();
		System.out.println("");
		try{
			System.out.println(lista.buscarDato("prueba 6").getElemento());
		}catch(NullPointerException er){
			System.out.println("No se encontro ese elemento en la lista");
		}
		try{
			System.out.println(lista.buscarInd(3).getElemento());
		}catch(NullPointerException ex){
			System.out.println("No se encuentra ningun elemento en esa posicion");
		}
		
		lista.imprimirAntSig();
		lista.insertarInicio("steven");
		lista.imprimirAntSig();
	}

}
