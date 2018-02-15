package zad1;

public abstract class Kwiat {
	
	public String name,color;
	public int quantity;
	
	public Kwiat(int quantity, String name, String color){
		this.quantity = quantity;
		this.name = name;
		this.color = color;
	}
	public String toString(){
		return name+", kolor: "+color+", ilość "+quantity+", cena "+PriceList.getInstance().get(name).doubleValue();
	}
}