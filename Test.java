/*public class student1 implements Cloneable {  
public static void main(String[] args) {  
int num = 0;  
switch (num){  
case 0:  
System.out.println("number is 0");  
break;  
case 1:  
System.out.println("number is 1");  
break;  
default:  
System.out.println(num);  
}  
}  
}*/

/*{
public static void main(String[] arg) {
for(;;)
{
System.out.println("Welcome to the universe!");
}
}
}
 */
/*import java.util.*;
class overload
{
	static int add(int a,int b)
	{
		return a+b;
	}
	static int add (int a,int b,int c)
	{
		return a+b+c;
	}
}
class overload2
{
	public static void main(String args[])
	{
		
		System.out.println(overload.add(2,4));
		System.out.println(overload.add(4,8,5));

	}
}	*/
import java .util.*;
class animal
{
    String color="black";
}
class dog extends animal{
	String color="white";
}
void print_color(){
	System.out.println(color);
	System.out.	println(super.color);
}
}
class Test
{
	public static void main(String arg[])
	dog d=new dog();
	d.print_color();
}
}





