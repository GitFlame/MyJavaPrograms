import java.util.*;

public class Vacation {

    static String destination;
    static String amount;

    public static void tourPackages(){
        System.out.println("------------------------------------------------------------");
        System.out.println("1. Destination Name :*Mcleodganj*    Amount: Rs. 50,000");
        System.out.println("2. Destination Name :*Binsar*   Amount: Rs. 85,000");
        System.out.println("3. Destination Name :*Maldives*  Amount: Rs. 5,00,000");
        System.out.println("4. Destination Name :*Manali*  Amount: Rs. 90,000 ");
        System.out.println("------------------------------------------------------------");

    }

    public static void MyTourPackageBill(String des, String amt){
        System.out.println("***** Your Tour Package Bill*****");
        System.out.println("---------------------------------");
        System.out.println("Destination Name :" +des);
        System.out.println("Destination Amount :Rs. " +amt);
        System.out.println("---------------------------------");
        System.out.println("**Have a wonderful Tour**");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Vacation.tourPackages();
        System.out.println("Enter your favourite destination name :");
        destination = sc.nextLine();
        System.out.println("Enter the amount for your choosed destination :");
        amount = sc.nextLine();
        System.out.println("---------------------------------------------------");
        Vacation.MyTourPackageBill(destination, amount);
    }
}



---------------------Output-----------------------------------------

------------------------------------------------------------
1. Destination Name :*Mcleodganj*    Amount: Rs. 50,000
2. Destination Name :*Binsar*   Amount: Rs. 85,000
3. Destination Name :*Maldives*  Amount: Rs. 5,00,000
4. Destination Name :*Manali*  Amount: Rs. 90,000 
------------------------------------------------------------
Enter your favourite destination name :
Manali
Enter the amount for your choosed destination :
90000
---------------------------------------------------
***** Your Tour Package Bill*****
---------------------------------
Destination Name :Manali
Destination Amount :Rs. 90000
---------------------------------
**Have a wonderful Tour**
