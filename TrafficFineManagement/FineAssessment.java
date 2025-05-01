package TrafficFineManagement;

public class FineAssessment extends TrafficRecord {

    public FineAssessment(String driverId, String driverName, String vehiclePlate, String violationType) {
        super(driverId, driverName, vehiclePlate, violationType);
    }

    @Override
    public void recordViolation() {
        System.out.println("FineAssessment class does not handle violation recording.");
    }

    @Override
    public void assessFine() {
        switch (violationType.toUpperCase()) {
            case "SPEEDING":
                fineAmount = 50000;
                break;
            case "RED_LIGHT":
                fineAmount = 80000;
                break;
            case "NO_HELMET":
                fineAmount = 30000;
                break;
            case "DUI":
                fineAmount = 150000;
                break;
            default:
                System.out.println("Error: Unrecognized violation type.");
                return;
        }
        System.out.printf("Fine assessed successfully:%nDriver: %s (%s)%nVehicle Plate: %s%nViolation: %s%nFine Amount: %.2f RWF%n",
                driverName, driverId, vehiclePlate, violationType, fineAmount);
    }

    @Override
    public void processPayment() {
        System.out.println("FineAssessment class does not handle payment processing.");
    }
}