import java.util.*;

// Average of 3 numbers, Input from user
public class PracticeQs1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int average = (A + B + C) / 3;

        System.out.println("Average is :" + average);
        sc.close();

    }
}