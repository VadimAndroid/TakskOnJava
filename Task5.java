public class Task5 {
    public static void main(String[] args){
        boolean result1 = Task5.solution("abc", "bc");
        boolean result2 = Task5.solution("abc", "b");
        System.out.println(result1); // Output: true
        System.out.println(result2); // Output: false
    }
    public static boolean solution(String str, String ending) {
        if (str == null || ending == null || str.length() < ending.length()) {
            return false;
        }
        return str.substring(str.length() - ending.length()).equals(ending);
    }
}

//alternative variation
//public static boolean solution(String str, String ending) {
//        return str.endsWith(ending);
//    }