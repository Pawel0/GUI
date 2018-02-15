package zad1;

import java.util.Iterator;

public class Customer {
	public final String name;
	private double saldo;
	ShoppingCart sc;

	public Customer(String s, int i) {
		name = s;
		saldo = i;
		sc = new ShoppingCart(s);
	}

	public ShoppingCart getShoppingCart() {
		return sc;
	}

	public void get(Kwiat k) {
		sc.add(k);		
	}

	public double getCash() {
		return saldo;
	}

	public void pay() {
		double suma = 0;
		for(Iterator<Kwiat> iter = sc.getList().iterator(); iter.hasNext();) {
			Kwiat data = iter.next();
			if ((PriceList.getInstance().get(data.name)<0) || (saldo < suma+PriceList.getInstance().get(data.name)*data.quantity)) {
				iter.remove();
			}
			else {
				suma += (PriceList.getInstance().get(data.name)*data.quantity); 
			}
		}
		saldo-=suma;
	}

	public void pack(Box b) {
		if (b.getList().addAll(sc.getList())){
			sc.getList().clear();
		}
	}

}