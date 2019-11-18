package TpProgra;

import java.util.*;
import javax.swing.JOptionPane;
public class Dijkstra {
	public int distancia[]= new int[10];
	public int costo[][] = new int [10][10];
	
	public void calculaTrayecto(int nodo , int referencia) {
		
		int aux[] = new int [nodo+1];
		int i , minpos =1,k,c=0,minimo;
		
		
		for(i=1 ; i<= nodo;i++) {
			aux[i] =0;// se inicializa en 0 porque no se encontraron valores minimos todavia.
			this.distancia[i] = this.costo[referencia][i];
			// Distancia almacena la distancia entre los nodos 
			// Guarda la fila de la referencia
		}
		while(c <= nodo) {
			minimo=99;
			for(k = 1; k <= nodo; k++) {
				if(this.distancia[k]<minimo && aux[k]!=1) {
					minimo= this.distancia[i];
					minpos =k;
				}
				//Una vez terminado el for guarda la menor posicion y el camino minimo.
			}
			aux[minpos]=1;
			c++;
			for(k=1;k<=nodo;k++) {
				if(this.distancia[minpos]+this.costo[minpos][k]<this.distancia[k]&&aux[k]!=1)
				this.distancia[k] = this.distancia[minpos]+this.costo[minpos][k];
				// Aca compara si la distancia directa de un nodo a otro es mejor que el camino normal que deberia hacer.
			}
		}
	}
	public static void main(String[] args) {
		int matriz[][] = new int [5][5];
		//inicializo la matriz
		matriz[0][0]=0;
		matriz[0][1]=5;
		matriz[0][2]=8; 
		matriz[0] [3]=99; // Se pone 99 en este y en los demas porque no tienen conexion directa
		matriz[0][4]=3;
		matriz[1][0]=5;
		matriz[1][1]=0;
		matriz[1][2]=9;
		matriz[1][3]=1;
		matriz[1][4]=4;
		matriz[2][0]=8;
		matriz[2][1]=9;
		matriz[2][2]=8;
		matriz[2][3]=99;
		matriz[2][4]=99;
		matriz[3][0]=99;
		matriz[3][1]=1;
		matriz[3][2]=99;
		matriz[3][3]=9;
		matriz[3][4]=6;
		matriz[4][0]=3;
		matriz[4][1]=4;
		matriz[4][2]=99;
		matriz[4][3]=6;
		matriz[4][4]=0;

	int nodo,referencia,i,j;
	nodo = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero De nodos matriz"));
    Dijkstra d = new Dijkstra();// inicializo la clase 
    for(i=1; i <=nodo; i++) {
    	for(j=1;j <= nodo;j++) {
    		d.costo[i][j] = matriz[i-1][j-1]; // Agarra la matriz creada y la pasamos a la matriz costo 
    	}
    }
referencia = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el nodo origen"));
d.calculaTrayecto(nodo, referencia);
System.out.println("Nodo origen: /t" + referencia + "/t las distancias son : /n");
for(i=1 ; i<= nodo; i++) {
	if(i!=referencia)
		System.out.println(
"nodo : " + referencia + "\tnodo destino:" + i + "\t Distancia :" + d.distancia[i] + "\t"				);
	}

	}

}
