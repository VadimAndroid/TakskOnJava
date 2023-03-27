public class Task {

    public static void main(String[] args) {
        String input = "abcdef";
        String[] pairs = solution(input);
        for (String pair : pairs) {
            System.out.println(pair);
        }
    }


    public static String[] solution(String s) {
        int length = s.length();
        int numPairs = (length + 1) / 2; // round up to ensure even number of pairs
        String[] result = new String[numPairs];
        int index = 0;
        for (int i = 0; i < length; i += 2) {
            if (i == length - 1) {
                result[index] = s.charAt(i) + "_";
            } else {
                result[index] = s.substring(i, i + 2);
            }
            index++;
        }
        return result;
    }

}