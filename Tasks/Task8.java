public class Task8 {
    public static void main(String[] args) {
        int[] ages = {25, 30, 18, 40, 12};
        int[] result = getHighestAndLowestAge(ages);
        System.out.println("The highest age is: " + result[0]);
        System.out.println("The lowest age is: " + result[1]);
    }
    
    public static int[] getHighestAndLowestAge(int[] ages) {
       int highestAge = ages[0];
      int lowestAge = ages[0];
      
      for (int i = 1; i < ages.length; i++) {
          if (ages[i] > highestAge) {
              highestAge = ages[i];
          }
          if (ages[i] < lowestAge) {
              lowestAge = ages[i];
          }
      }
      
      return new int[] {highestAge, lowestAge};
    }
  }
  