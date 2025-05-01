package HotelManagement;

public class Billing extends HotelService {

    public Billing(String guestId, String guestName, String roomType, int stayDays, String roomStatus) {
        super(guestId, guestName, roomType, stayDays, roomStatus);
    }

    @Override
    public void bookRoom() {
        System.out.println("Billing class does not handle room booking.");
    }

    @Override
    public void checkoutGuest() {
        System.out.println("Billing class does not handle guest checkout.");
    }

    @Override
    public void generateBill() {
        double costPerNight;
        switch (roomType.toUpperCase()) {
            case "STANDARD":
                costPerNight = 50000;
                break;
            case "DELUXE":
                costPerNight = 80000;
                break;
            case "SUITE":
                costPerNight = 120000;
                break;
            default:
                System.out.println(" Invalid room type.");
                return;
        }
        double totalCost = costPerNight * stayDays;
        System.out.printf("Billing Details:%nGuest: %s (%s)%nRoom Type: %s%nStay Duration: %d days%nTotal Cost: %.2f RWF%n",
                guestName, guestId, roomType, stayDays, totalCost);
    }
}