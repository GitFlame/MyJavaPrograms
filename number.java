//practical question 2015( page no:-204)
import java.util.*;
class number
{
   Scanner sc=new Scanner(System.in);
   int m,n,i,j,d=0,v=0,s=0;
   void input()
   {
     System.out.println("Enter the greatest number");
     m=sc.nextInt();
     System.out.println("Enter the lowest number");
     n=sc.nextInt();
    }
    void cal()
    {
        if(m>=100 && m<=10000 && n>0 && n<=100)
        {
            for(i=m;i<=10000;i++)
            {
                s=0;
                v=0;
                for(j=i;j>0;j=j/10)
                {
                    d=j%10;
                    s=s+d;
                    v++;
                }
                if(s==n)
                {
                    System.out.println("The required no.="+i);
                    System.out.println("The total sum of digits="+v);
                    break;
                }
            }
        }
        else
        
            System.out.println("Invalid Input");
        }
        public void main()
        {
            number obj=new number();
            obj.input();
            obj.cal();
           
        }
    }
        
   