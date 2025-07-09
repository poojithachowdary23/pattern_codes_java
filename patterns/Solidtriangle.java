 import java.util.Scanner;
public class Solidtriangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
              {
                if(i+j>=n-1)
                {
                 System.out.print("* ");
                }
                else 
                {
                   System.out.print("  ");
                }
              }
               for(int k=0;k<n;k++)
              {
                if(i>=k+1)
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
