package software.ulpgc.kata1;

public record Velocity(double distanceInKilometers, double timeInHours) {
    public double calculateKilometersPerHour() {
        return distanceInKilometers / timeInHours;
    }
}
