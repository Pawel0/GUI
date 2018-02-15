package zad1;

import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {
	private List<Kwiat> lista;
	private String owner,type = "Wózek";

	public ShoppingCart(String o){
		lista = new LinkedList<Kwiat>();
		owner = o;
	}
	
	public ShoppingCart(String o, String t){
		lista = new LinkedList<Kwiat>();
		owner = o;
		type = t;
	}
	
	public void add(Kwiat k){
		lista.add(k);
	}
	public void remove(Kwiat k){
		lista.remove(k);
	}
	
	public List<Kwiat> getList(){
		return lista;
	}
	public String toString(){
		if(lista.isEmpty()){
			return type+" własciciel "+owner+" -- pusto";
		}
		else{
			String r = type+" własciciel "+owner+"\n";
			for (Kwiat k : lista)
				r+=k.toString()+"\n";
			return r.substring(0, r.length()-1);
		}
	}
}
