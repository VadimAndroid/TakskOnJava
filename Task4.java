public class Task4 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        boolean containsThree = containsValue(numbers, 3);
        System.out.println(containsThree); // Output: true

        String[] words = {"hello", "world", "this", "is", "great"};
        boolean containsGoodbye = containsValue(words, "goodbye");
        System.out.println(containsGoodbye); // Output: false
    }

    public static boolean containsValue(Object[] a, Object x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(x)) {
                return true;
            }
        }
        return false;
    }
}

//alternative variation
//import java.util.Arrays;
//
//public class Solution {
//
//    public static boolean check(Object[] a, Object x) {
//        return Arrays.asList(a).contains(x);
//    }
//
//}
