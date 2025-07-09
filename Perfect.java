import java.util.Scanner;
public class Perfect
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i=1;
        int sum=0;
        while(i<num)
        {
            if(num%i==0)
            {
                sum+=i;
            }
            i++;
        }
        if(num==sum)
        {
            System.out.println(num+" is perfect num");
        }
        else
        {
            System.out.println(num+" is not perfect num");
        }
        
    }
}