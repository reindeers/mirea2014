/**
 * Created by sever on 22.03.2015.
 */
public interface MyMap<K, V> {
    public V get(K key);
    void put(K key, V value);
    void remove(K key);
    int hash(Object k);
    int size();
}