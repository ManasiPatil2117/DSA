public class DynamicArray {
    public static void main(String[] args) {
        Dynamic d = new Dynamic();
        d.add(10);
        d.add(12);
        d.add(13);
        d.add(14);
        d.add(15);
        d.print();
        // System.out.println(d.size());
        // d.set(3,50);
    //    System.out.println(d.get(3));
    //    System.out.println(d.isEmpty());
       System.out.println(d.removeLast());
       System.out.println(d.removeLast());
       System.out.println(d.removeLast());
       System.out.println(d.removeLast());
       System.out.println(d.removeLast());
       System.out.println(d.isEmpty());
       d.print();       
    }
}

class Dynamic {
    private int data[];
    private int nextIndex;

    public Dynamic() {
        data = new int[5];
        nextIndex = 0;
    }

    public int size() {
        return nextIndex;
    }

    public void add(int ele) {
        if (nextIndex == data.length) {
            restructure();
        }
        data[nextIndex] = ele;
        nextIndex++;
    }

    private void restructure() {
        int temp[] = data;
        data = new int[nextIndex * 2];
        for (int i = 0; i < temp.length; i++) {
            data[i] = temp[i];
        }

    }

    public int get(int i) {
        if (i >= nextIndex)
            return -1;
        return data[i];
    }

    public void set(int i, int e){
        if(i>=nextIndex){
            System.out.println("Cannot insert");
        }else{
            data[i] = e;
        }
    }

    public boolean isEmpty(){
        if(size() == 0){
            return true;
        }
        return false;
    }
    public int removeLast(){
        int t = data[nextIndex-1];
        data[nextIndex-1] = 0;
        nextIndex--;
        return t;
    }

    public void print() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

}
