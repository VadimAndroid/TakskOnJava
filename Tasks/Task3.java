public class Task3
{
    public static void main(String[] args){
        int[] a = {3,4,-5,-6,-7,8};
        int[] result = countPositivesSumNegatives(a);
        System.out.println("The count of positive numbers is: " + result[0]);
        System.out.println("The sum of negative numbers is: " + result[1]);
    }
    public static int[] countPositivesSumNegatives(int[] input)
    {
        if (input == null || input.length == 0) return new int[] {};
        int count = 0,sum = 0;
        for (int i : input) {
            if (i > 0) count ++;
            if (i < 0) sum += i;
        }
        return new int[] {count,sum};
    }
}