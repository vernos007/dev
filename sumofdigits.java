import java.util.*;
public class SOD
{
    int sod(int n)
    {
        return (n==0)?0:n%10+sod(n/10);
    }
    public static void main(String args[])
    {
        SOD ob=new SOD();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int sum=ob.sod(n);
        System.out.println("SUM OF DIGITS="+sum);
    }
}