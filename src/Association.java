
public class Association<K extends Comparable<K>, V> implements Comparable<Association<K,V>> {

	
	K key;
	V value;
	
	Association(K key_, V value_){
		key = key_;
		value = value_;
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	
	@Override
	public int compareTo(Association<K, V> o) {
		// TODO Auto-generated method stub
		return key.compareTo(o.getKey());
	}



}
