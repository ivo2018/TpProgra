package TpProgra;

import java.util.ArrayList;
import java.util.List;
public class Maindfs {

	public static void main(String[] args) {
	   Vertice v1 = new Vertice ("9"); // 9-4-2  2-5 5-3
	   Vertice v2 = new Vertice ("4");   // 
	   Vertice v3 = new Vertice ("2"); //
	   Vertice v4 = new Vertice ("5");
	   Vertice v5 = new Vertice ("3");
 List<Vertice> list = new ArrayList<>();
 v1.agregaVecino(v2);
 v1.agregaVecino(v3);
 v3.agregaVecino(v4);
 v4.agregaVecino(v5);
 
 list.add(v1);
 list.add(v2);
 list.add(v3);
 list.add(v4);
 list.add(v5);
 Dfs dfs = new Dfs();
 dfs.dfs(list);
  
	}

}
