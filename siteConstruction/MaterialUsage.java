package siteConstruction;
public class MaterialUsage extends ConstructionMaterial {

    public MaterialUsage(String contractorId, String contractorName, double materialQuantity, double materialBalance) {
        super(contractorId, contractorName, materialQuantity, materialBalance);
    }

    @Override
    public void receiveMaterial(double quantity) {
        System.out.println("Material usage class does not handle material delivery.");
    }

    @Override
    public void useMaterial(double quantity) {
        if (materialBalance - quantity >= 2) {
            materialBalance -= quantity;
            System.out.println("Material used successfully. Remaining balance: " + materialBalance + " tons.");
        } else {
            System.out.println("Error: Insufficient material. Material balance must remain ≥ 2 tons.");
        }
    }

    @Override
    public void estimateCost() {
        System.out.println("Material usage class does not handle cost estimation.");
    }
}