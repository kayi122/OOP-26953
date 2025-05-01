package TrafficFineManagement;

public abstract class TrafficRecord {
    protected String driverId;
    protected String driverName;
    protected String vehiclePlate;
    protected String violationType;
    protected double fineAmount;
    protected String paymentStatus;

    public TrafficRecord(String driverId, String driverName, String vehiclePlate, String violationType) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.vehiclePlate = vehiclePlate;
        this.violationType = violationType;
        this.paymentStatus = "UNPAID"; // Default payment status
    }

    public abstract void recordViolation();
    public abstract void assessFine();
    public abstract void processPayment();
}