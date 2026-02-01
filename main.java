import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    char isStudent, isSenior;

    System.out.println("=========================================");
    System.out.println("        PHANTEKZY DISCOUNT SYSTEM        ");
    System.out.println("=========================================");

    // Input the price
    System.out.print(" >> Enter Item Price: $");
    while (!scan.hasNextDouble()) {
      System.out.println(" [!] Error: Enter a numeric price.");
      System.out.print(" >> Enter Item Price: $");
      scan.next();
    }
    double price = scan.nextDouble();

    while (true) {
      System.out.print(" >> Student Status? (y/n): ");
      isStudent = scan.next().toLowerCase().charAt(0);
      if (isStudent == 'y' || isStudent == 'n') break;
      System.out.println(" [!] Error: Please enter 'y' for yes or 'n' for no.");
    }

    while (true) {
      System.out.print(" >> Senior Citizen? (y/n) :");
      isSenior = scan.next().toLowerCase().charAt(0);
      if (isSenior == 'y' || isSenior == 'n') break;
      System.out.println(" [!] Error: Please enter 'y' for yes or 'n' for no.");
    }

    double discountPercent =
        (isSenior == 'y' && isStudent == 'y')
            ? 30
            : (isStudent == 'y') ? 20 : (isSenior == 'y') ? 10 : 0;

    String reason =
        (discountPercent == 30)
            ? "Combo (Student+Senior)"
            : (discountPercent == 20)
                ? "Student Discount"
                : (discountPercent == 10) ? "Senior Discount" : "Standard Rate";

    // Calculations
    double savings = price * (discountPercent / 100);
    double finalPrice = price - savings;

    // The outputs
    System.out.println("\n +-------------------------------------+");
    System.out.println(" |           OFFICIAL RECEIPT          |");
    System.out.println(" +-------------------------------------+");
    System.out.printf(" |  Base Price:           $%10.2f  |%n", price);
    System.out.printf(" |  Discount:             -%9.2f   |%n", savings);
    System.out.printf(" |  Type: %-28s |%n", reason);
    System.out.println(" |-------------------------------------|");
    System.out.printf(" |  TOTAL TO PAY:         $%10.2f  |%n", finalPrice);
    System.out.println(" +-------------------------------------+");

    scan.close();
  }
}
