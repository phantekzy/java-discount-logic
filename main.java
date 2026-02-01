import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // Input the price
    System.out.print("Please Enter the price of the Item : ");
    double price = scan.nextDouble();

    // Ask for Student Status
    System.out.print("Are you a Student ? (y/n): ");
    char isStudent = scan.next().toLowerCase().charAt(0);

    // Ask for Citizen Status
    System.out.print("Are you a Senior Citizen ? (y/n) :");
    char isSenior = scan.next().toLowerCase().charAt(0);

    // Discount and the reason of the discount
    double discountPercent = 0;
    String reason = "";

    // The logic
    if (isStudent == 'y' && isSenior == 'y') {
      discountPercent = 30;
      reason = "Student and Senior Discount combo";
    } else if (isStudent == 'y') {
      discountPercent = 20;
      reason = "Student Discount";
    } else if (isSenior == 'y') {
      discountPercent = 10;
      reason = "Senior Discount";
    } else {
      reason = "No discount applied";
    }

    // Calculations
    double savings = price * (discountPercent / 100);
    double finalPrice = price - savings;

    // The outputs
    System.out.println("\n--- TRANSACTION SUMMARY ---");
    System.out.printf("Base Price:     $%.2f%n", price);
    System.out.printf("Discount Type:  %s (%d%%)%n", reason, (int) discountPercent);
    System.out.printf("Amount Saved:   $%.2f%n", savings);
    System.out.println("---------------------------");
    System.out.printf("TOTAL TO PAY:   $%.2f%n", finalPrice);

    scan.close();
  }
}
