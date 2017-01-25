package epn;

public class Nodo {
	
	private String elemento;
	private Nodo siguiente; 
	private Nodo anterior;
	
	public Nodo(String elemento) {
		this.elemento = elemento;
		this.siguiente = this.siguiente=null;
	}

	public Nodo(String elemento, Nodo siguiente, Nodo anterior) {
		super();
		this.elemento = elemento;
		this.siguiente = siguiente;
		this.anterior = anterior;
	}

	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	public Nodo getAnterior() {
		return anterior;
	}

	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}
	
	
	

}
