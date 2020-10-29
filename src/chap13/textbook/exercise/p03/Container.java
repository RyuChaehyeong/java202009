package chap13.textbook.exercise.p03;

public class Container<T, K>{
	T t;
	K k;
	
	public void set(T t, K k) {
		this.t = t;
		this.k = k;
	}
	
	public T getKey() {
		return t;
	}
	
	public K getValue() {
		return k;
	}
}
