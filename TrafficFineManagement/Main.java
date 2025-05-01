package TrafficFineManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String driverId;
        while (true) {
            System.out.print("Enter Driver ID (16 digits): ");
            driverId = scanner.nextLine();
            if (driverId.matches("\\d{16}")) { 
                break;
            } else {
                System.out.println("Invalid input. Driver ID must be exactly 16 digits. Please try again.");
            }
        }

        
        String driverName;
        while (true) {
            System.out.print("Enter Driver Name: ");
            driverName = scanner.nextLine();
            if (driverName.matches("[a-zA-Z ]+")) { 
                break;
            } else {
                System.out.println("Invalid input. Driver Name must contain only letters and spaces. Please try again.");
            }
        }

        
        String vehiclePlate;
        while (true) {
            System.out.print("Enter Vehicle Plate (e.g., RAB123D): ");
            vehiclePlate = scanner.nextLine();
            if (vehiclePlate.matches("[A-Z]{3}\\d{3}[A-Z]")) { 
                break;
            } else {
                System.out.println("Invalid input. Vehicle Plate must follow the format (e.g., RAB123D). Please try again.");
            }
        }

        
        String violationType;
        while (true) {
            System.out.print("Enter Violation Type (SPEEDING, RED_LIGHT, NO_HELMET, DUI): ");
            violationType = scanner.nextLine();
            if (violationType.equalsIgnoreCase("SPEEDING") ||
                violationType.equalsIgnoreCase("RED_LIGHT") ||
                violationType.equalsIgnoreCase("NO_HELMET") ||
                violationType.equalsIgnoreCase("DUI")) {
                break;
            } else {
                System.out.println("Invalid input. Violation Type must be one of the following: SPEEDING, RED_LIGHT, NO_HELMET, DUI. Please try again.");
            }
        }

        
        ViolationEntry violationEntry = new ViolationEntry(driverId, driverName, vehiclePlate, violationType);
        violationEntry.recordViolation();

        
        FineAssessment fineAssessment = new FineAssessment(driverId, driverName, vehiclePlate, violationType);
        fineAssessment.assessFine();

        
        System.out.print("Do you want to pay the fine? (yes/no): ");
        String payFine = scanner.nextLine();
        if (payFine.equalsIgnoreCase("yes")) {
            FinePayment finePayment = new FinePayment(driverId, driverName, vehiclePlate, violationType, fineAssessment.fineAmount);
            finePayment.processPayment();
        } else {
            System.out.println("Payment not processed. Fine remains unpaid.");
        }

        scanner.close();
    }
}