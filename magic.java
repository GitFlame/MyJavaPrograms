import java.util.*;
class magic
{
    int n;
    magic()
    {
        n=0;
    }
    void getnum(int nn)
    {
        n=nn;
    }
    int Sum_of_digits(int q)
    {
        int sum=0;
        while(q>0)
        {
            sum=sum+q%10;
            q=q/10;
        }
        return sum;
    }
    public void ismagic()
    {
        int s=n;
        while(s>9)
        {
            s=Sum_of_digits(s);
        }
        if(s==1)
        {
            System.out.println(n+"is a magic number");
        }
        else
        {
            System.out.println(n+"is not a magic number");
        }
        
    }
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input a number to check for magic:");
        int v=sc.nextInt();
        magic obj=new magic();
        obj.getnum(v);
        obj.ismagic();
    }
}
        