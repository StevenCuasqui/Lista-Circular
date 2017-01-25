package epn;

public class ListaCircularDo {
	
	protected Nodo cabeza;
	protected long tam;
	
	public ListaCircularDo() {
		this.tam=0;
		this.cabeza=null;
	}

	public ListaCircularDo(Nodo cabeza, long tam) {
		this.cabeza = null;
		this.tam = tam;
	}
	
	public boolean vacia(){
		return cabeza==null;
	}
	
	
}
