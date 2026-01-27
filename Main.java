public class Main {
    public static void main(String[] args) {

        RideBookingSystem system = new RideBookingSystem();

        // Users
        User driver = new User(1, "Himanshu", "2024107289.himanshu@ug.sharda.ac.in", "1234");
        User passenger = new User(2, "Pandey", "@gmail.com", "abcd");

        system.addUser(driver);
        system.addUser(passenger);

        // Create Ride
        Ride ride1 = new Ride(101, "Delhi", "Noida", 4, 150, driver);
        system.addRide(ride1);

        // Show rides
        system.showAvailableRides();

        // Book ride
        system.bookRide(101, passenger, 2);

        // Show all bookings
        system.showAllBookings();
    }
}
