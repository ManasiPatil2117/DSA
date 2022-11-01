import java.util.*;

// Time complexity : O(n)O(n).

// Although the time complexity appears to be quadratic due to the while loop nested within the for loop, closer inspection reveals it to be linear. Because the while loop is reached only when currentNum marks the beginning of a sequence (i.e. currentNum-1 is not present in nums), the while loop can only run for nn iterations throughout the entire runtime of the algorithm. This means that despite looking like O(n \cdot n)O(n⋅n) complexity, the nested loops actually run in O(n + n) = O(n)O(n+n)=O(n) time. All other computations occur in constant time, so the overall runtime is linear.
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int arr[] = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6 };
        int c = 0, t = 0, tt = 0;
        String st = "", ts = "";
        int longestStreak = 0;
        Set<Integer> num_set = new HashSet<>();
        Set<Integer> ans = new HashSet<>();
        Set<Integer> temp = new HashSet<>();

        for (int i = 0; i < arr.length; i++)
            num_set.add(arr[i]);

        for (int num : num_set) {
            if (!num_set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                temp.removeAll(temp);
                temp.add(num);

                while (num_set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                    temp.add(currentNum);
                }

                if (longestStreak < currentStreak) {
                    longestStreak = currentStreak;
                    ans = new HashSet<>(temp);
                    temp.remove(temp);
                }
            }
        }

        System.out.println(ans);

    }
}
