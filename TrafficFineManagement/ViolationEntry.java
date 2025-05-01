package TrafficFineManagement;

import java.util.Arrays;

public class ViolationEntry extends TrafficRecord {

    private static final String[] ALLOWED_VIOLATIONS = {"SPEEDING", "RED_LIGHT", "NO_HELMET", "DUI"};

    public ViolationEntry(String driverId, String driverName, String vehiclePlate, String violationType) {
        super(driverId, driverName, vehiclePlate, violationType);
    }

    @Override
    public void recordViolation() {
        if (Arrays.stream(ALLOWED_VIOLATIONS).anyMatch(violationType::equalsIgnoreCase)) {
            System.out.println("Violation recorded successfully:");
            System.out.printf("Driver: %s (%s)%nVehicle Plate: %s%nViolation: %s%nPayment Status: %s%n",
                    driverName, driverId, vehiclePlate, violationType, paymentStatus);
        } else {
            System.out.println("Error: Invalid violation type. Allowed types are: " + String.join(", ", ALLOWED_VIOLATIONS));
        }
    }

    @Override
    public void assessFine() {
        System.out.println("ViolationEntry class does not handle fine assessment.");
    }

    @Override
    public void processPayment() {
        System.out.println("ViolationEntry class does not handle payment processing.");
    }
}