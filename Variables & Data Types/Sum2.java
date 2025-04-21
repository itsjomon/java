import java.util.*;

//sum of a & b, Input from user
public class Sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
        sc.close();
    }
}