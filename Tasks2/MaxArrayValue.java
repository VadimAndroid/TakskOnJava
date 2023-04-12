package Tasks2;

public class MaxArrayValue {
  public static void main(String[] args) {
    int[] numbers = {5, 2, 9, 1, 7};
    int maxNumber = getMaxNumber(numbers);
    System.out.println("The maximum number is: " + maxNumber);
}

    public static int getMaxNumber(int[] numbers) {
      int Max = numbers[0];
      for(int i = 1; i < numbers.length; i++){
        if(numbers[i] > Max){
          Max = numbers[i];
        }
      }
      return Max;
    }
  }
  
