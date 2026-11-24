package software.ulpgc.kata1;

public record Shop(String name, double pricePerUnit, int unitsSold) {

    public double calculateRevenue() {
        return pricePerUnit() * pricePerUnit();
    }

    public String getName() {
        return name;
    }
}
