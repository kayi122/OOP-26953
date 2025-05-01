package TrafficFineManagement;

public class FinePayment extends TrafficRecord {

    public FinePayment(String driverId, String driverName, String vehiclePlate, String violationType, double fineAmount) {
        super(driverId, driverName, vehiclePlate, violationType);
        this.fineAmount = fineAmount;
    }

    @Override
    public void recordViolation() {
        System.out.println("FinePayment class does not handle violation recording.");
    }

    @Override
    public void assessFine() {
        System.out.println("FinePayment class does not handle fine assessment.");
    }

    @Override
    public void processPayment() {
        if (paymentStatus.equalsIgnoreCase("PAID")) {
            System.out.println("Error: Fine has already been paid.");
        } else {
            paymentStatus = "PAID";
            System.out.printf("Payment processed successfully:%nDriver: %s (%s)%nVehicle Plate: %s%nPaid Amount: %.2f RWF%nPayment Status: %s%n",
                    driverName, driverId, vehiclePlate, fineAmount, paymentStatus);
        }
    }
}