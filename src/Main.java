import  java.util.Scanner;

public class Main {
    private static int getChange(int m) {
        //write your code here
        int count = 0;
        if (m >= 10){
            while (m / 10 >= 1){
                count++;
                m -= 10;
            }
        }
        if (m >= 5){
            while (m / 5 >= 1){
                count++;
                m -= 5;
            }
        }
        if (m >= 1 && m < 5){
            count += m;
        }
        return count;
    }
    public static void main (String args []){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));
    }
}
