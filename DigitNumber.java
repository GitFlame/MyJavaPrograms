import java.util.*;
class DigitNumber
{
   Scanner sc=new Scanner(System.in);
   int num,sum;
   DigitNumber()
   { 
       num=0;
       sum=0;
    }
     void DigiNumber(int n)
    {
        n=num;
    }
    void digitfrequency()
    {
        int c=0; int digit,p,i;int n;
        for(i=0;i<9;i++)
        {
            n=num;
            c=0;
            while(n>0)
            {
                digit=n%10;
                if(digit==i)
                {
                    c++;
                }
                n=n/10;
            }
            if(c>=1)
            System.out.println("frequency of number="+c);
        }
        public int IsSumDigit(){
            int N;
        if(N!=0)
        {
            sum=sum+N%10;
            IsSumDigit(N/10);
            return N;
        }
    }
    void printsum()
    {
        int l=SumDigit(num);
        System.out.println("number of sum of digit="+l);
    }
    public void main()
    {
        DigitNumber obj=new DigitNumber();
        System.out.println("Enter a number");
        int a=sc.nextInt();
        obj.IsSumDigit(a);
        obj.printsum();
    }
}