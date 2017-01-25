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
	}

}
