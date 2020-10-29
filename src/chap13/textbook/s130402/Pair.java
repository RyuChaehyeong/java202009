package chap13.textbook.s130402;

public class Pair<K, V> {
	//필드
	private K key;
	private V value;
	
	//생성자
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	//메소드
	public void setKey(K key) {
		this.key = key;
	}
	public void setValue(V value) {
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}

	
	
}
