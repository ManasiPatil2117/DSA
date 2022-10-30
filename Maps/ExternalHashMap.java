import java.util.ArrayList;

class Node<K, V> {
    K key;
    V value;
    Node<K, V> next;

    Node(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

class Map<K, V> {
    ArrayList<Node<K, V>> bucketArray;
    int size = 0;
    int bucketCapacity;

    Map() {
        bucketArray = new ArrayList<>();
        for (int i = 0; i < 20; i++)
            bucketArray.add(null);
        bucketCapacity = 10;
    }

    int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        return hashCode % bucketCapacity;
    }

    void insert(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        Node<K, V> head = bucketArray.get(bucketIndex);
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        head = bucketArray.get(bucketIndex);
        Node<K, V> newEle = new Node<>(key, value);
        newEle.next = head;
        bucketArray.set(bucketIndex, newEle);
        size++;
        double loadFactor = (1.0 * size) / bucketCapacity;
        if (loadFactor > 0.7) {
            reHash();
        }
    }

    void reHash() {
        ArrayList<Node<K, V>> temp = bucketArray;
        bucketCapacity *= 2;
        bucketArray = new ArrayList<Node<K, V>>();
        for (int i = 0; i < bucketCapacity; i++) {
            bucketArray.add(null);
        }
        for (int i = 0; i < size; i++) {
            int h = getBucketIndex(temp.get(i).key);
            bucketArray.set(h, temp.get(i));
        }
    }

    V getValue(K key) {
        int bucketIndex = getBucketIndex(key);
        Node<K, V> head = bucketArray.get(bucketIndex);
        while (head != null) {
            if (head.key == key)
                return head.value;
            head = head.next;
        }
        return null;
    }

    void remove(K key) {
        int bucketIndex = getBucketIndex(key);
        Node<K, V> head = bucketArray.get(bucketIndex), prev = null;

        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null) {
                    bucketArray.set(bucketIndex, head.next);
                    size--;
                } else {
                    prev.next = head.next;
                }
            }
            prev = head;
            head = head.next;
        }
    }
}

public class ExternalHashMap {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new Map<>();

        for (int i = 0; i < 15; i++)
            map.insert(i, i + 1);

        System.out.println("Before Deleting");
        for (int i = 0; i < 15; i++)
            System.out.println(map.getValue(i));
        System.out.println("Map size: " + map.size);

        map.remove(2);
        map.remove(10);

        System.out.println("\nAfter Deleting");
        for (int i = 0; i < 15; i++)
            System.out.println(map.getValue(i));
        System.out.println("Map size: " + map.size);
    }
}
