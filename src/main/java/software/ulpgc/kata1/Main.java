package software.ulpgc.kata1;

public class Main {
    public static void main(String[] args) {
        Velocity trip = new Velocity(150, 2.5);
        System.out.println("Velocidad media: " + trip.calculateKilometersPerHour() + " km/h" );

    }
}
