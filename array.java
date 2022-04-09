import java.util.*;// pakage defined
class array  // class defined
{
   public boolean search(int m[],int ns)
   {
       int i;
       boolean p=false;
       for(i=0;i<5;i++)
       {
           if(m[i]==ns)
           p=true;
        }
        return(p);
    }
    public void main()//  main function defined
    {
        Scanner sc=new Scanner(System.in);
        int i,ns;
        int m[]=new int[10];
        boolean y;
        array ob=new array();
        for(i=0;i<5;i++)
        {
            System.out.println("enter your marks");
            m[i]=sc.nextInt();
        }
        System.out.println("Enter your number to be searched");
        ns=sc.nextInt();
        y=ob.search(m,ns);
        if(y==true)
        {
            System.out.println("The search is successfull");
            System.out.println("The number is:"+ns);
        }
        else
        {
            System.out.println("The search is unsuccessfull");
        }
    }//main function block closed
}// class block closed