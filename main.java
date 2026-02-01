import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Scanner
    Scanner scan = new Scanner(System.in);

    // PHANTEKZY DISCOUNT SYSTEM
    System.out.println("=========================================");
    System.out.println("       PHANTEKZY DISCOUNT SYSTEM         ");
    System.out.println("=========================================");

    // Input logic
    System.out.print(" >> Enter Item Price : $");
    while (!scan.hasNextDouble()) {
      System.out.println(" [!] Invalid Format. Use numbers only.");
      System.out.print(" >> Enter Item Price: $");
      scan.next();
    }
    // Scan  the price
    double price = scan.nextDouble();
    // Student Status
    System.out.print(" >> Are a Student ? (y/n): ");
    char isStudent = scan.next().toLowerCase().charAt(0);
    // Senior Status
    System.out.print(" >> Are a Senior Citizen ? (y/n): ");
    char isSenior = scan.next().toLowerCase().charAt(0);

    // logic
    double discountPercent = 0;
    String reason = "";

    if (isStudent == 'y' && isSenior == 'y') {
      discountPercent = 30;
      reason = "Combo (Student+Senior)";
    } else if (isStudent == 'y') {
      discountPercent = 20;
      reason = "Student Discount";
    } else if (isSenior == 'y') {
      discountPercent = 10;
      reason = "Senior Discount";
    } else {
      reason = "Standard Rate";
    }

    double savings = price * (discountPercent / 100);
    double finalPrice = price - savings;

    // --- FINAL RECEIPT DECORATION ---
    System.out.println("\nProcessing Transaction...");
    System.out.println(".........................\n");

    System.out.println(" +-------------------------------------+");
    System.out.println(" |           OFFICIAL RECEIPT          |");
    System.out.println(" +-------------------------------------+");
    System.out.printf(" |  Base Price:           $%10.2f  |%n", price);
    System.out.printf(" |  Discount:             -%9.2f   |%n", savings);
    System.out.printf(" |  Type: %-28s |%n", reason);
    System.out.println(" |                                     |");
    System.out.println(" |-------------------------------------|");
    System.out.printf(" |  TOTAL TO PAY:         $%10.2f  |%n", finalPrice);
    System.out.println(" +-------------------------------------+");
    System.out.println("      Thank you for shopping with us!   \n");
    // Close the scan
    scan.close();
  }
}
