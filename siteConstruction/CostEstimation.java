package siteConstruction;
public class CostEstimation extends ConstructionMaterial {

    public CostEstimation(String contractorId, String contractorName, double materialQuantity, double materialBalance) {
        super(contractorId, contractorName, materialQuantity, materialBalance);
    }

    @Override
    public void receiveMaterial(double quantity) {
        System.out.println("Cost estimation class does not handle material delivery.");
    }

    @Override
    public void useMaterial(double quantity) {
        System.out.println("Cost estimation class does not handle material usage.");
    }

    @Override
    public void estimateCost() {
        double costPerTon;
        if (materialQuantity >= 5 && materialQuantity <= 15) {
            costPerTon = 200000;
        } else if (materialQuantity > 15) {
            costPerTon = 180000;
        } else {
            System.out.println(" Material quantity must be at least 5 tons for cost estimation.");
            return;
        }
        double totalCost = materialQuantity * costPerTon;
        System.out.printf("Contractor ID: %s%nContractor Name: %s%nQuantity Used: %.2f tons%nTotal Cost: %.2f%n",
                contractorId, contractorName, materialQuantity, totalCost);
    }
}