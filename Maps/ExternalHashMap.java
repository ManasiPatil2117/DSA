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

    Map(K key, V value) {
        bucketArray = new ArrayList<>();
        for (int i = 0; i < 20; i++)
            bucketArray.add(null);
        bucketCapacity = 20;
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
        Map<Integer, Integer> map = new Map<>(null, null);
        map.insert(1, 10);
        map.insert(2, 20);
        map.insert(3, 30);
        map.insert(4, 40);
        System.out.println("Before Deleting");
        System.out.println(map.getValue(1));
        System.out.println(map.getValue(2));
        System.out.println(map.getValue(3));
        System.out.println(map.getValue(4));
        map.remove(2);
        System.out.println("\nAfter Deleting");
        System.out.println(map.getValue(1));
        System.out.println(map.getValue(2));
        System.out.println(map.getValue(3));
        System.out.println(map.getValue(4));
    }
}
