package Tasks2;

public class CenturyFromYear {
    public static void main(String[] args){
        int a = 2006;
        int year = getCentury(a);
        System.out.println(year);
    }

    public static int getCentury(int year) {
        return year % 100 == 0 ? (year / 100) : (year / 100 + 1);
    }
}

