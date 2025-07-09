import java.util.Scanner;
public class Spy
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        int product = 1;
        while (temp > 0) 
        {
            int last = temp % 10;
            sum += last;
            product *= last;
            temp /= 10;
        }

        if (sum == product)
         {
            System.out.println(num + " is a Spy Number.");
        } else 
        {
            System.out.println(num + " is NOT a Spy Number.");
        }
        sc.close();
    }
}
