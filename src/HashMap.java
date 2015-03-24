import java.util.Objects;
import java.util.Map;
/**
 * Created by sever on 22.03.2015.
 */
public class HashMap<K, V> implements MyMap<K, V> { // ToDo: проверить существующее хэшированние
    private int cnt = 0;
    private Node<K, V>[] ar;

    HashMap(){
        ar = (Node<K,V>[])new Node[1000]; //ToDo: fix - ?
    }

    HashMap(int sz){
        ar = (Node<K,V>[])new Node[sz];
    }
    public int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16); //ToDo: алгоритм
    }
    public void put(K key, V value){
        ar[hash(key)] = new Node<K, V>(key, value); //ToDo: добавить хэширование с цепочками, проверка флага
        cnt++;
    }
    public V get(K key){
        if ((ar[hash(key)] != null) & (!ar[hash(key)].isDeletedFlag())) return ar[hash(key)].getValue();
        else return null;
    }
    public void remove(K key){
        if (!ar[hash(key)].isDeletedFlag()) { ar[hash(key)].deletedFlag = true; cnt--; } 
    }

    public int size(){
        return cnt;
    }
    static class Node<K, V> implements Map.Entry<K,V>{
        final int hash = 0;
        final K key;
        boolean deletedFlag = false;
        V value;

        Node( K key, V value) {
            this.key = key;
            this.value = value;
        }
        public K getKey(){ return key; }
        public V getValue(){return value; }
        public final String toString() { return key + "=" + value; }
        public final int hashCode() {
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        } //ToDo: ?
        public final V setValue(V newValue) {
            V oldValue = value;
            value = newValue;
            return oldValue;
        }
        public boolean isDeletedFlag(){
            if (deletedFlag == false) return false;
            else return true;
        }
        public final boolean equals(Node n) {
            if (this.key == n.key && this.value == n.value) return true;
            else return false;
        }
    }
}
