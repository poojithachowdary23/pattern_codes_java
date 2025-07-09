import java.util.Scanner;
class Reverse
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n]; 
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i = 0, k = n - 1; i < n; i++, k--)
        {
           // int temp = arr[i];
           // arr[i] = arr[k];
           // arr[k] = temp;
           arr1[i]=arr[k];
        }
        for (int i=0;i<n;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}