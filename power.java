import java.util.Scanner;

class power
{
    public static void main(String[] args) {
        int i,n,k,result=1;
        System.out.println(" Enter the Base number\n");
        Scanner Sc=new Scanner(System.in);
        n=Sc.nextInt();
        System.out.println(" Enter the Exponent\n");
        //Scanner Sc=new Scanner(System.in);
        k=Sc.nextInt();
        Sc.close();
        for(i=0;i<k;i++)
        {
           result=result*n;
        }
        System.out.print(result);
    }
}
