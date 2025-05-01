package HotelManagement;

public class RoomBooking extends HotelService {

    public RoomBooking(String guestId, String guestName, String roomType, int stayDays, String roomStatus) {
        super(guestId, guestName, roomType, stayDays, roomStatus);
    }

    @Override
    public void bookRoom() {
        if (stayDays < 1 || stayDays > 30) {
            System.out.println(" Stay duration must be between 1 and 30 days.");
            return;
        }
        if (!roomStatus.equalsIgnoreCase("AVAILABLE")) {
            System.out.println(" Room is not available for booking.");
            return;
        }
        roomStatus = "OCCUPIED";
        System.out.printf("Booking successful!%nGuest: %s (%s)%nRoom Type: %s%nStay Duration: %d days%nRoom Status: %s%n",
                guestName, guestId, roomType, stayDays, roomStatus);
    }

    @Override
    public void checkoutGuest() {
        System.out.println("RoomBooking class does not handle guest checkout.");
    }

    @Override
    public void generateBill() {
        System.out.println("RoomBooking class does not handle billing.");
    }
}