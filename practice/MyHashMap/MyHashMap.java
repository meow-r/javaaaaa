public class MyHashMap<K,V>{
    public static class Node<K,V>{
        final K key;
        final int hash;
        V value;
        Node<K,V> next;

        Node(int hash ,K key, V value, Node<K,V> next){
            this.key = key;
            this.value = value;
            this.next = next;
            this.hash = hash;
        }
    }

    Node<K,V>[] table;
    int DEFAULT_CAPACITY = 16;
    int size = 0;
    int thershold;

    public MyHashMap(){
        table = (Node<K,V>[]) new Node[DEFAULT_CAPACITY];
        thershold = (int) (DEFAULT_CAPACITY * 0.75);
    }


    private int hash(K key){
        return key == null? 0 : key.hashCode();
    }

    private int indexFor(int hash){
        return hash & table.length - 1;
    }

    public void put(K key, V value){
        int hash = hash(key);
        int index = indexFor(hash);

        Node<K,V> head = table[index];

        for (Node<K,V> e = head; e != null; e = e.next){
            if(e.hash == hash && (e.key == key || (key != null && e.key.equals(key)))){
                e.value = value;
                return;
            }
        }

        table[index] = new Node<>(hash, key, value, head);
        size ++;
        if(size > thershold){
            resize();
        }
    }

    public V get(K key){
        int hash = hash(key);
        int index = indexFor(hash);

        Node<K,V> head = table[index];

        for (Node<K,V> e = head; e != null; e = e.next){
            if(e.hash == hash && (e.key == key || (key != null && e.key.equals(key)))){
                return e.value;
            }
        }

        return null;
    }

    private void resize(){
        Node<K,V>[] newTable;
        int newCapacity = table.length * 2;
        newTable = (Node<K,V>[]) new Node[newCapacity];
        thershold = (int) (newCapacity * 0.75);

        for(int i = 0; i < table.length; i ++){
            Node<K,V> e = table[i];
            while (e != null){
                Node<K,V> next = e.next;
                int index = e.hash & (newCapacity-1);
                e.next = newTable[index];
                newTable[index] = e;
                e = next;
            }
        }

        table = newTable;
    }
    
}