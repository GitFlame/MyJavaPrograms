//Question 03(2018)
import java.util.*;
public class abc1
{
   public void main()
   {
       Scanner sc=new Scanner(System.in); 
       String ar[];
       int i,j,n;
       System.out.println("Enter the numbers of names");
       n=sc.nextInt();
       ar=new String[n];
       System.out.println("enter the name: ");
       for(i=0;i<n;i++)
       {
           ar[i]=sc.nextLine();
        }
        int max=0;
        for(i=0;i<n;i++)
        {
            if(max<ar[i].length())
               max=ar[i].length();
            }
            System.out.println("OUTPUT : " );
            for(i=0;i<max;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(i<ar[j].length())
                    {
                        System.out.print(ar[j].charAt(i)+"\t");
                    }
                        else
                        {
                        System.out.print("\t");
                    }
                    System.out.println();
                }
            }
        }
    }
            
       
       