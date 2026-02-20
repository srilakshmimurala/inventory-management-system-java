import java.util.ArrayList;
import java.util.Scanner;
//inventory management system
// OOP, encapsulation, abstraction are the used methods which helps the users to add, display and calculate.
public class InventoryManager {
    // to store all the product objects dynamically, ArrayList is used. 
    private static ArrayList<Product> productList = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=====  List of Products =====");
            System.out.println("1. Add  the Product");
            System.out.println("2. Display the  Products");
            System.out.println("3. Calculate  the Total Value");
            System.out.println("4. Exit");
            System.out.print("Enter  your  choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addProduct(sc);
                    break;
                case 2:
                    displayProducts();
                    break;
                case 3:
                    calculateTotalValue();
                    break;
                case 4:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }

    // Abstraction – separate method
    private static void addProduct(Scanner sc) {

        System.out.print("Enter the product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name of the product: ");
        String name = sc.nextLine();

        System.out.print("Enter the required Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter the Price of the product: ");
        double price = sc.nextDouble();

        Product product = new Product(id, name, quantity, price);
        productList.add(product);

        System.out.println("Product Has Been Added Successfully!");
    }

    private static void displayProducts() {

        if (productList.isEmpty()) {
            System.out.println("Given product is not available currently!");
            return;
        }

        for (Product p : productList) {
            p.displayProduct();
        }
    }

    private static void calculateTotalValue() {

        double total = 0;

        for (Product p : productList) {
            total += p.calculateTotalAmount();
        }

        System.out.println("Total Value of the products: " + total);
    }
}