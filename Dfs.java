package TpProgra;

import java.util.List;
import java.util.Stack;

public class Dfs {
	private Stack<Vertice> stack; // apila el vertice
	
	public Dfs() {
		this.stack = new Stack<>();
	}
	
public void dfs(List<Vertice> verticeList) {
	
	for(Vertice v : verticeList) {
		if(!v.isVisitado() ) {
			v.setVisitado(true);
			dfsConStack(v);
		}
	}
}

private void dfsConStack(Vertice vRaiz) {
	
	this.stack.add(vRaiz);
	 vRaiz.setVisitado(true);
	  
	while( !stack.isEmpty() ) { // mientras que la pila no este vacia
		
		Vertice actualVertice = this.stack.pop();
		System.out.print(actualVertice+" ");
		
		for(Vertice v : actualVertice.getVecinoLista() ) {
			if(!v.isVisitado() ) {
				v.setVisitado(true);
				this.stack.push(v);
			}
		}
	}
}
}