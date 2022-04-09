import java.util.*;//pakage defined
class Armstrong//class defined
{
    int n,s;//variable defined
    void input(int n1)
    {
    
        n=n1;
    }
    void calculate()
    {
        int c=n;
        int b,s=0;
        while(c>0)//by using while loop
        {
            b=c%10;
            s=s+(b*b*b);
            c=c/10;
        }
        if(s==n)
        System.out.println("It is an Armstrong number");
        else
        System.out.println("It is not an Armstrong number");
    }
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        int n2;//variable defined
        System.out.println("Enter a number");
        n2=sc.nextInt();
        Armstrong obj=new Armstrong();//object defined
        obj.input(n2);
        obj.calculate();
    }//main function block closed
}//class block closed
        
            