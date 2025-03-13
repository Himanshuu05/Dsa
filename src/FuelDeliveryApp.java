import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class FuelOrder {
    private String customerName;
    private String fuelType;
    private int quantity;
    private String location;

    public FuelOrder(String customerName, String fuelType, int quantity, String location) {
        this.customerName = customerName;
        this.fuelType = fuelType;
        this.quantity = quantity;
        this.location = location;
    }

    public void displayOrder() {
        System.out.println("Customer: " + customerName);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Quantity: " + quantity + " liters");
        System.out.println("Location: " + location);
    }
}

public class FuelDeliveryApp {
    public static void main(String[] args) {
        List<FuelOrder> orders = new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name :");
        String customerName= sc.nextLine();
        System.out.println("Enter fuel type :");
        String fuelType= sc.nextLine();
        System.out.println("Enter quantitiyy in litres ");
        int quantity= sc.nextInt();
        System.out.println("Enter your location for fuel delivery :");
        String location= sc.nextLine();



        orders.add(new FuelOrder(customerName,fuelType,quantity,location));

        System.out.println("Fuel Delivery Orders:");
        for (FuelOrder order : orders) {
            order.displayOrder();
            System.out.println("--------------------");
        }
    }
}
