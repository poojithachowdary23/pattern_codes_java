import java.util.Scanner;
public class Invertedryt
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               if(i+j==n-1||i==0||j==0)
               {
                 System.out.print("* ");
               }
               else
               {
                 System.out.print("  ");
               }
            }
            System.out.println();
        }
    }
}