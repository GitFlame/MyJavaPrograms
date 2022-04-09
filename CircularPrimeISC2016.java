import java.util.*;
class CircularPrimeISC2016
{
    int isPrime(int n) // Function for checking whether a number is prime or not
    {
        int c = 0;
        for(int i = 1; i<=n; i++)
        {
            if(n%i == 0)
                c++;
        }
        if(c == 2)
            return 1;
        else
            return 0;
    }
    int circulate(int n) //Function for circulating the digits to form new number
    {
        String s = Integer.toString(n);
        String p = s.substring(1)+s.charAt(0);
        int a = Integer.parseInt(p);
        return a;
    }
    void isCircularPrime(int n) //Function to check for circular prime
    {
        int f = 0,a = n;
        do{
        
            System.out.println(n);
            if(isPrime(n)==0)
            {
                f = 1;
                break;
            }
            n = circulate(n);
        }while(a!=n);
        
        if(f==1)
            System.out.println("OUTPUT:-"+n+" IS NOT A CIRCULAR PRIME");
        else
            System.out.println("OUTPUT:-"+n+" IS A CIRCULAR PRIME");
    }
    public static void main(String args[])
    {
        CircularPrimeISC2016 obj = new CircularPrimeISC2016();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your INPUT : ");
        int n = sc.nextInt();
        obj.isCircularPrime(n);
    }
}