package siteConstruction;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        String contractorId;
        while (true) {
            System.out.print("Enter Contractor ID: ");
            contractorId = scanner.nextLine();
            if (contractorId.matches("[a-zA-Z0-9]+")) { 
                break;
            } else {
                System.out.println("Invalid input. Contractor ID must be alphanumeric. Please try again.");
            }
        }

       
        String contractorName;
        while (true) {
            System.out.print("Enter Contractor Name: ");
            contractorName = scanner.nextLine();
            if (contractorName.matches("[a-zA-Z ]+")) { 
                break;
            } else {
                System.out.println("Invalid input. Contractor Name must contain only letters and spaces. Please try again.");
            }
        }

        
        double materialQuantity;
        while (true) {
            System.out.print("Enter Initial Material Quantity (in tons): ");
            try {
                materialQuantity = Double.parseDouble(scanner.nextLine());
                if (materialQuantity > 0) { 
                    break;
                } else {
                    System.out.println("Invalid input. Material Quantity must be a positive number. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for Material Quantity.");
            }
        }

        
        double materialBalance;
        while (true) {
            System.out.print("Enter Initial Material Balance (in tons): ");
            try {
                materialBalance = Double.parseDouble(scanner.nextLine());
                if (materialBalance >= 0) { // Ensure non-negative value
                    break;
                } else {
                    System.out.println("Invalid input. Material Balance must be a non-negative number. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for Material Balance.");
            }
        }

        
        MaterialDelivery delivery = new MaterialDelivery(contractorId, contractorName, materialQuantity, materialBalance);
        MaterialUsage usage = new MaterialUsage(contractorId, contractorName, materialQuantity, materialBalance);
        CostEstimation estimation = new CostEstimation(contractorId, contractorName, materialQuantity, materialBalance);

        
        System.out.println("\n--- Material Delivery ---");
        double deliveryQuantity;
        while (true) {
            System.out.print("Enter delivery quantity (in tons): ");
            try {
                deliveryQuantity = Double.parseDouble(scanner.nextLine());
                if (deliveryQuantity > 0) { 
                    break;
                } else {
                    System.out.println("Invalid input. Delivery quantity must be a positive number. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for delivery quantity.");
            }
        }
        delivery.receiveMaterial(deliveryQuantity);

        
        System.out.println("\n--- Material Usage ---");
        double usageQuantity;
        while (true) {
            System.out.print("Enter usage quantity (in tons): ");
            try {
                usageQuantity = Double.parseDouble(scanner.nextLine());
                if (usageQuantity > 0) { 
                    break;
                } else {
                    System.out.println("Invalid input. Usage quantity must be a positive number. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for usage quantity.");
            }
        }
        usage.useMaterial(usageQuantity);

        
        System.out.println("\n--- Cost Estimation ---");
        estimation.estimateCost();

        scanner.close();
    }
}