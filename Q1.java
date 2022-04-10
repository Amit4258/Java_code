import java.util.*;

class Q1
{
    public static void main(String[] args) {
        int i,n;
        System.out.println(" Enter the length of the series\n");
        Scanner Sc=new Scanner(System.in);
        n=Sc.nextInt();
        for(i=0;i<=n;i++)
        {
           if(i%2==0)
           {
               System.out.print(i+" ");
           }
           else
           {
            System.out.print(i/2+" ");
           }
        }
    }
}