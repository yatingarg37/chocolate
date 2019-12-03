package assignments;


import java.util.Scanner;
class chocolate
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the no. of students");
        int n1=sc.nextInt();
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
            }
        }
        int dif=0;
        for(int i=0;i<n1;i++)
        {
            dif=arr[n1-1]-arr[0];
        }
System.out.println(dif);

    }
}
