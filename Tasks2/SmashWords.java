package Tasks2;

public class SmashWords {
    public static void main(String[] args){
        String result = SmashWords.smash("Hello", "world", "!");
        System.out.println(result);
    }
    public static String smash(String... words) {
        return String.join(" ", words);
    }
}