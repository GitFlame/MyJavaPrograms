import  java.util.*;
class unique_number
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter any number");
        n=sc.nextInt();
        String s=Integer.toString(n);
        int l=s.length();
        int p=0;
        for(int i=0;i<l-1;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    p=1;
                    break;
                }
            }
        }
        if(p==0)
        System.out.println("******* The number is a unique number********");
        else
        System.out.println("******* The number is not a unique number*****");
    }
}