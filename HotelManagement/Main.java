package HotelManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String guestId;
        while (true) {
            System.out.print("Enter Guest ID: ");
            guestId = scanner.nextLine();
            if (guestId.matches("[A-Za-z0-9]+")) { 
                break;
            } else {
                System.out.println("Invalid input. Guest ID must be alphanumeric. Please try again.");
            }
        }

        
        String guestName;
        while (true) {
            System.out.print("Enter Guest Name: ");
            guestName = scanner.nextLine();
            if (guestName.matches("[a-zA-Z ]+")) { 
                break;
            } else {
                System.out.println("Invalid input. Guest Name must contain only letters and spaces. Please try again.");
            }
        }

        
        String roomType;
        while (true) {
            System.out.print("Enter Room Type (STANDARD, DELUXE, SUITE): ");
            roomType = scanner.nextLine();
            if (roomType.equalsIgnoreCase("STANDARD") ||
                roomType.equalsIgnoreCase("DELUXE") ||
                roomType.equalsIgnoreCase("SUITE")) {
                break;
            } else {
                System.out.println("Invalid input. Room Type must be one of the following: STANDARD, DELUXE, SUITE. Please try again.");
            }
        }

        
        int stayDays;
        while (true) {
            System.out.print("Enter Stay Duration (in days): ");
            try {
                stayDays = Integer.parseInt(scanner.nextLine());
                if (stayDays >= 1 && stayDays <= 30) { 
                    break;
                } else {
                    System.out.println("Invalid input. Stay Duration must be between 1 and 30 days. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for Stay Duration.");
            }
        }

        
        String roomStatus;
        while (true) {
            System.out.print("Enter Room Status (AVAILABLE, OCCUPIED): ");
            roomStatus = scanner.nextLine();
            if (roomStatus.equalsIgnoreCase("AVAILABLE") || roomStatus.equalsIgnoreCase("OCCUPIED")) {
                break;
            } else {
                System.out.println("Invalid input. Room Status must be either AVAILABLE or OCCUPIED. Please try again.");
            }
        }

        
        RoomBooking roomBooking = new RoomBooking(guestId, guestName, roomType, stayDays, roomStatus);
        roomBooking.bookRoom();

        
        GuestCheckout guestCheckout = new GuestCheckout(guestId, guestName, roomType, stayDays, roomStatus);
        guestCheckout.checkoutGuest();

        
        Billing billing = new Billing(guestId, guestName, roomType, stayDays, roomStatus);
        billing.generateBill();

        scanner.close();
    }
}