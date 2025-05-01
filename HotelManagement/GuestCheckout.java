package HotelManagement;

public class GuestCheckout extends HotelService {

    public GuestCheckout(String guestId, String guestName, String roomType, int stayDays, String roomStatus) {
        super(guestId, guestName, roomType, stayDays, roomStatus);
    }

    @Override
    public void bookRoom() {
        System.out.println("GuestCheckout class does not handle room booking.");
    }

    @Override
    public void checkoutGuest() {
        if (!roomStatus.equalsIgnoreCase("OCCUPIED")) {
            System.out.println(" Room is already available. No checkout needed.");
            return;
        }
        roomStatus = "AVAILABLE";
        System.out.printf("Checkout successful!%nGuest: %s (%s)%nRoom Type: %s%nRoom Status: %s%n",
                guestName, guestId, roomType, roomStatus);
    }

    @Override
    public void generateBill() {
        System.out.println("GuestCheckout class does not handle billing.");
    }
}