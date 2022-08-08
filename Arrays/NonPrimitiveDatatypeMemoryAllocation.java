package Arrays;

public class NonPrimitiveDatatypeMemoryAllocation{
    public static void increment(int a[]){
        a = new int[5];
        for(int i =0;i<a.length;i++){
            a[i]++;
        }
    }
    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,4,5};
        System.out.println("Value stored in a is: "+a +"\n^^ here '[' indicated that it is a address and 'I' indicated that it is a integer and '@ad041f3' is an object");
        increment(a);
        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}

// Here a stored the refence of the memory location where the array is stored and when we pass a to the increment() the value inside a i.e. address inside the a is passed to the function and
// function increment() increments the value which is stored at the same memory location

// if we uncomment the line no 5 new memory is created and it is initialized with 0 and new referencec is generted for a and the values in that get incremented so a in increment() will hold array as [1,1,1,1,1]
// and when increment() is executed the a in there gets flushed and in main when we print a older version of a is printed