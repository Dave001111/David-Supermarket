import java.util.Scanner;
 public class SuperMarket {
   public static void main(String[] args) {

 Scanner input = new Scanner(System.in);

 String[] items = {"Rice", "Beans", "Garri", "Sugar", "Biscuits", "Sweets", "Spaghetti", "Book", "Water", "Juice"};
 double[] price = {1500.00, 2000.00, 2500.00, 800.00, 500.00, 200.00, 1000.00, 700.00, 2400.00, 3800.00};

 String[] userItems = new String[items.length];
 int[] userQuantity = new int[items.length];
 double[] userPrice = new double [items.length];


   int index = 0;
  int count = 1;
 System.out.println("Welcome To David Supermarket");
 System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
 System.out.println("List of our available products");
  
 for (index = 0; index < items.length; index++) {
      System.out.printf("%-4d %-12s% .2f%n",count, items[index], price[index]);
       count+= 1;
         }
 
 
  String choice = "yes";
  while (choice.equalsIgnoreCase("yes")) {
  System.out.print("\nSelect between option 1-10 for what user bought: ");
  int option = input.nextInt();

  if (option <= 0 || option > 10) {
  System.out.print("Invalid option. select between option 1-10: ");
  option = input.nextInt();
    }
  
   
      if (option == 1) {
      System.out.print("you selected Rice");
     } else if
      (option == 2) {
       System.out.print("You selected Beans");
     } else if 
       (option == 3) {
        System.out.print("You selected Garri");
     } else if 
       (option == 4) {
        System.out.print("You selected Sugar");
     } else if
       (option == 5) {
        System.out.print("You selected Biscuits");
    } else if 
      (option == 6) {
        System.out.print("You selected Sweets");
    } else if 
      (option == 7) {
        System.out.print("You selected Spaghetti"); 
   } else if 
     (option == 8) {
       System.out.print("You selected Book");
  } else if 
    (option == 9) {
      System.out.print("You selected Water");
  } else if 
     (option == 10) {
       System.out.print("You selected Juice") ;
  } 
    
  
  System.out.print("\nHow many quantity did the customer buy: ");
  int quantity = input.nextInt();

  


  System.out.print("Did the customer buy another product?: (yes/no): ");
  choice = input.next();

  while (!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no")) {
  System.out.print("Invalid option. select yes or no");

  System.out.print("Did the customer buy another product?: (yes/no): ");
  choice = input.next();
 
  
  }

 }

 double billTotal = 0;

 System.out.println("\nDAVID SUPERMARKET");
 System.out.println("==============================");
 System.out.printf("%-12s %-12s %-12s%n", "ITEMS", "QUANTITY", "TOTAL");
 System.out.println("------------------------------");

 for (index = 0; index < userItems.length; index++) {

 double total = userPrice[index] * userQuantity[index];

 billTotal += total;

  System.out.printf("%-12s %-12d %-12.2f%n",userItems[index], userQuantity[index], total);
} 

System.out.println("------------------------------");
System.out.printf("BILL TOTAL: %.2f%n", billTotal);
System.out.println("==============================");
System.out.println("Thanks for your patronage");
System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

System.out.print("How much did the customer give you: ");
double amountPaid = input.nextDouble(); 

while (amountPaid < billTotal) {
System.out.println("Amount is less than bill total.");

System.out.print("Enter amount again: ");
amountPaid = input.nextDouble();
   } 


     




  }

}