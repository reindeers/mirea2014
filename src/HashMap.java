import java.util.Objects;
import java.util.Map;
/**
 * Created by sever on 22.03.2015.
 */
public class HashMap<K, V> implements MyMap<K, V> { //+ добавить хэширование с цепочками

    private int cnt = 0;
   // Node<K,V>[]  ar = (Node<K,V>[])new Node[1000];
    private Node<K, V>[] ar;


    HashMap(){
        ar = (Node<K,V>[])new Node<K,V>[1000]; //исправить
    }

    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16); //алгоритм!
    }

    public void put(K key, V value){
        int t = hash(key);
        ar[t] = new Node<K, V>(key, value);
        cnt++;
    }

    public V get(K key){
        return ar[hash(key)].getValue();
    }

    public void remove(K key){
        ar[hash(key)] = null; //??
    }

    public int hash(){
        return 0; //исправить
    }
    public int size(){
        return cnt;
    }

    static class Node<K, V> implements Map.Entry<K,V>{
        final int hash = 0;
        final K key;
        V value;

        Node( K key, V value) { //int hash, Node<K,V> next
            // this.hash = hash;
            this.key = key;
            this.value = value;
            // this.next = next;
        }
        public K getKey(){ return key; }
        public V getValue(){return value; }
        public final String toString() { return key + "=" + value; }

        public final int hashCode() {
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        } //посмотреть алгоритм

        public final V setValue(V newValue) {
            V oldValue = value;
            value = newValue;
            return oldValue;
        }

        public final boolean equals(Object o) {
            return false; //не реализовано
        }
    }

}

