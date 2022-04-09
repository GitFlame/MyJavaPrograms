import java.util.*;
public class A
{
public static void main(String args[])
{
    Scanner obj=new Scanner(System.in);
     double a,b,c,s,area;
    System.out.println("Enter 1st side of the triangle");
      a=obj.nextDouble();
    System.out.println("Enter 2nd side of the triangle");
       b=obj.nextDouble();
    System.out.println("Enter 3rd side of the triangle");
       c=obj.nextDouble();
    
      s=(a+b+c)/2;
      area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
     System.out.format("The area of the triangle is= \n", area);
    }
   }