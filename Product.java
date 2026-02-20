public class Product {

    private int productId;
    private String productName;
    private int stock;
    private double unitPrice;

    public Product(int productId, String productName, int stock, double unitPrice) {
        this.productId = productId;
        this.productName = productName;
        this.stock = stock;
        this.unitPrice = unitPrice;
    }

    public void displayProduct() {
        System.out.println("ID: " + productId);
        System.out.println("Name: " + productName);
        System.out.println("Quantity: " + stock);
        System.out.println("Price: " + unitPrice);
        System.out.println("--------------------");
    }

    public double calculateTotalAmount() {
        return stock * unitPrice;
    }
}
