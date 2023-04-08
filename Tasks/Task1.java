public class Task1 {

    public static void main(String[] args) {
        String sentence = "How can mirrors be real if our eyes aren't real";
        String jadenCase = toJadenCase(sentence);
        System.out.println(jadenCase);
    }



    public static String toJadenCase(String sentence) {
        if (sentence == null || sentence.length() == 0) {
            return sentence;
        }
        String[] words = sentence.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0)));
            sb.append(word.substring(1));
            sb.append(" ");
        }
        sb.setLength(sb.length() - 1); // remove the last space
        return sb.toString();
    }


}