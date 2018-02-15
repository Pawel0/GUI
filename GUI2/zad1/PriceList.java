package zad1;

import java.util.HashMap;

public class PriceList  {
	private static PriceList instance = null;
	private HashMap<String, Double> lista;
	
	private PriceList(){
		lista = new HashMap<String, Double>();
	}

	public static PriceList getInstance() {
		 if(instance == null) {
			 instance = new PriceList();
		 }
	     return instance;
	}

	public void put(String string, double d) {
		lista.put(string, d);
		
	}
	public Double get(String name){
		if(lista.get(name)!= null) return lista.get(name);
		else return -1.0;
	}
	
	
}