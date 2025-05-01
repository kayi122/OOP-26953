package siteConstruction;
public class MaterialDelivery extends ConstructionMaterial {

    public MaterialDelivery(String contractorId, String contractorName, double materialQuantity, double materialBalance) {
        super(contractorId, contractorName, materialQuantity, materialBalance);
    }

    @Override
    public void receiveMaterial(double quantity) {
        if (quantity >= 1 && quantity <= 10) {
            materialBalance += quantity;
            System.out.println("Material delivered successfully. Updated balance: " + materialBalance + " tons.");
        } else {
            System.out.println("Error: Delivery quantity must be between 1 and 10 tons.");
        }
    }

    @Override
    public void useMaterial(double quantity) {
        System.out.println("Material delivery class does not handle material usage.");
    }

    @Override
    public void estimateCost() {
        System.out.println("Material delivery class does not handle cost estimation.");
    }
}