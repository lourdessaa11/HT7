/**
 * @author Manuel Martinez
 * @author Lourdes Saavedra
 * 
 * Association.
 * Asociación que contiene una llave y un valor.
 * La llave es un comparable
 */

public class Association<K extends Comparable<K>, V> implements Comparable<Association<K,V>> {

	K key;
	V value;
	
	/**
	 * Constructor
	 * @param key_ llave
	 * @param value_ valor
	 */
	Association(K key_, V value_){
		key = key_;
		value = value_;
	}
	
	/**
	 * Llave
	 * @return llave
	 */
	public K getKey() {
		return key;
	}
	
	/**
	 * Valor
	 * @return valor
	 */
	public V getValue() {
		return value;
	}
	
	/**
	 * Compara la llave de las asociaciones
	 */
	@Override
	public int compareTo(Association<K, V> o) {
		// TODO Auto-generated method stub
		return key.compareTo(o.getKey());
	}

	/**
	 * Convierte la llave a String
	 */
    @Override
    public String toString(){
        return key.toString();
    }

}
