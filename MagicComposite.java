import java.util.*;
class MagicComposite
{
    boolean isComposite(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
             count++;
            }
            if(count>2)
                  return true;
             else 
                  return false;
            }
      int sumDig(int n)
      {
          int s=0;
          while(n>0)
          {
             
                 s=s+n%10;
                 n=n/10;
                }
                return s;
            }
        boolean isMagic(int n)
        {
            int b=sumDig(n);
            while(b>9)
            {
                b=sumDig(b);
            }
            if(b==1)
                 return true;
            else
                 return false;
        }
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            MagicComposite obj=new MagicComposite();
            System.out.println("Enter the lower limit(m)  :");
            int m=sc.nextInt();
            System.out.println("Enter the upper limit(n)  :");
            int n=sc.nextInt();
            int c=0;
            if(m<n)
            {
                System.out.println("The CompositeMagic no  :");
                for(int i=m;i<=n;i++)
                {
                    if(obj.isComposite(i)==true && obj.isMagic(i)==true)
                    {
                        if(c==0)
                        
                        System.out.print(i);
                    
                    else
                    
                        System.out.print(",  "+i);
                        c++;
                    }
                }
                System.out.println("\t"+"nThe frequency of Composite Magic Integers is :="+c);
            }
        
            else
            
                System.out.println("OUT OF RANGE");
            }
        
    }


                
                        
                            
            
            
               

                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                       
      