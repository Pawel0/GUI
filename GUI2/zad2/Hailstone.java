package zad2;

import java.util.Iterator;

public class Hailstone implements Iterable<Integer>{

	private int a;
	public Hailstone(int ini) {
		a = ini;
	}
	
	@Override
	public Iterator<Integer> iterator() {
		return new MyIterator();
	}
	
	class MyIterator implements Iterator<Integer>{
		private boolean first = true;
		
		@Override
		public boolean hasNext() {
			if(a == 1) return false;
			else return true;
		}

		@Override
		public Integer next() {
			if (first){
				first = false;
				return a;
			}
			else if(a%2==0){
				a=a/2;
				return a;
			}
			else{
				a=3*a+1;
				return a;
			}
		}
	}
}
