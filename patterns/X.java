import java.util.Scanner;
public class Square
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               if(i==j||i+j==n-1)
               {
                 System.out.print(num-j +" ");
               }
               else
               {
                 System.out.print(" ");
               }
            }
            System.out.println();
        }
    }
}
