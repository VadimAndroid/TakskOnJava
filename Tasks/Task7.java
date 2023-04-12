public class Task7 {
    public static void main(String[] args){
        int[] num = createArray();
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
    }
    
    public static int[] createArray() {
        int[] numbers = new int[5];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1; 
        }
        return numbers;
      }
}
