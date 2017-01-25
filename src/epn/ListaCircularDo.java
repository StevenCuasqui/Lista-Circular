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
	
	public void insertarInicio(String elem){
		Nodo actual= new Nodo(elem);
		if(vacia()){
			cabeza=actual;
			cabeza.setSiguiente(cabeza);
			cabeza.setAnterior(cabeza);
		}
		else{
			Nodo p=cabeza;
			while(p.getSiguiente()!=cabeza){
				p=p.getSiguiente();
			}
			p.setSiguiente(actual);
			actual.setAnterior(p);
			actual.setSiguiente(cabeza);
			cabeza.setAnterior(actual);
			cabeza=actual;
						
		}
	}
	
	public void insertarFinal(String elem){
		Nodo actual= new Nodo(elem);
		if(vacia()){
			cabeza=actual;
			cabeza.setSiguiente(cabeza);
			cabeza.setAnterior(cabeza);
		}
		else{
			Nodo p=cabeza;
			while(p.getSiguiente()!=cabeza){
				p=p.getSiguiente();
			}
			if(p.getSiguiente()==cabeza){
				p.setSiguiente(actual);
				actual.setAnterior(p);
				actual.setSiguiente(cabeza);
				cabeza.setAnterior(actual);
			}else{
				Nodo q=p.getAnterior();
				actual.setAnterior(q);
				q.setSiguiente(actual);
				actual.setSiguiente(p);
				p.setAnterior(actual);
			}
				
		}
		
	}
	
	public void imprimir(){
		if(vacia()){
			System.out.println("Lista Vacia");
		}
		else{
			Nodo actual=cabeza;
			do{
				System.out.println(actual.getElemento());
				actual=actual.getSiguiente();
			}while(actual!=cabeza);
		}
	}
	
}
