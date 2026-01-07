// Abstract Class: Railway
// Represents a railway ticket booking system
abstract class Railway {
    // Abstract method to book a ticket
    abstract void bookTicket(String passengerName, int numPassengers);
    
    // Abstract method to cancel a ticket
    abstract void cancelTicket(String passengerName);
}

// Concrete Class: SleeperClass
// Represents a sleeper class ticket booking
class SleeperClass extends Railway {
    // Implements the bookTicket method for sleeper class
    @Override
    void bookTicket(String passengerName, int numPassengers) {
        // Print ticket booking confirmation message
        System.out.println("Sleeper Class Ticket booked for " + passengerName + " with " + numPassengers + " passengers.");
    }

    // Implements the cancelTicket method for sleeper class
    @Override
    void cancelTicket(String passengerName) {
        // Print ticket cancellation confirmation message
        System.out.println("Sleeper Class Ticket cancelled for " + passengerName + ".");
    }
}

// Concrete Class: AcClass
// Represents an AC class ticket booking
class AcClass extends Railway {
    // Implements the bookTicket method for AC class
    @Override
    void bookTicket(String passengerName, int numPassengers) {
        // Print ticket booking confirmation message
        System.out.println("AC Class Ticket booked for " + passengerName + " with " + numPassengers + " passengers.");
    }

    // Implements the cancelTicket method for AC class
    @Override
    void cancelTicket(String passengerName) {
        // Print ticket cancellation confirmation message
        System.out.println("AC Class Ticket cancelled for " + passengerName + ".");
    }
}

// Driver Class: RailwayTicketBooking
public class RailwayTicketBooking {
    public static void main(String[] args) {
        // Declare a Railway reference variable
        Railway railway;

        // Create a SleeperClass object and assign it to the railway variable
        // Polymorphism in action!
        railway = new SleeperClass();
        // Book a sleeper class ticket
        railway.bookTicket("John Doe", 2);
        // Cancel a sleeper class ticket
        railway.cancelTicket("John Doe");

        // Create an AcClass object and assign it to the railway variable
        // Polymorphism in action!
        railway = new AcClass();
        // Book an AC class ticket
        railway.bookTicket("Jane Doe", 1);
        // Cancel an AC class ticket
        railway.cancelTicket("Jane Doe");
    }
}
