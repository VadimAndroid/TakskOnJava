public class Task6 {
    public static void main(String[] args) {
      int result1 = Task6.makeNegative(1);
      System.out.println(result1);  // prints -1
      
      int result2 = Task6.makeNegative(-5);
      System.out.println(result2);  // prints -5
      
      int result3 = Task6.makeNegative(0);
      System.out.println(result3);  // prints 0
    }
    
    
        public static int makeNegative(final int x) {
          if (x > 0) {
            return -x;
          }
          return x;
        }
      
  }
  

  