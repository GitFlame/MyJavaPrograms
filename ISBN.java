import java.util.*;
class ISBN
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 10 digit code:");
        String s=sc.nextLine();
        int l=s.length();
        if(l!=10)
        System.out.println("Output:invalid Input");
        else
        {
            char ch;
            int dig=0,sum=0,k=10;
            for(int i=0;i<l;i++)
            {
                ch=s.charAt(i);
                if(ch=='X')
                   dig=10;
                   else
                   dig=ch-48;
                   sum=sum+dig*k;
                   k--;
                }
                System.out.println("Output: Sum="+sum);
                if(sum%11==0)
                System.out.println("Leaves No remainder-Valid ISBN code");
                else
                System.out.println("Leaves Remainder-Invalid ISBN code");
            }
        }
    }
        
        
   
    