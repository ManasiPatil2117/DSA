package Arrays;

public class PrimitiveDatatypeMemoryAllocation{
    public static void increment(int i){
        i++;
        System.out.println("Value of i in increment(): " + i);
    }
    public static void main(String[] args) {
        int i =25;
        increment(i);
        System.out.println("Value of i in main(): " + i);
    }
}

// This happened so because everything in java is pass by value
// in main function we are call increment() and passing the value of i
// incremen() takes value of i and stores it in its local variable named as i 
// it works on its local variable i.e. it incremented i value and after completing its execution of a function the local members of a function are ditroyed and hence when we print i value in main it prints 25 and not 26