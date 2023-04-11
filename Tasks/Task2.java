public class Task2{
    public static void main(String[] args){
        StringBuilder builder = new StringBuilder();
        builder.append("hello ").append("world ").append(31);
        String string = builder.toString();
        System.out.println(string);
    }
}