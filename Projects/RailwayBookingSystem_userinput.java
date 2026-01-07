import java.util.Scanner;

// Abstract Class: Railway
abstract class Railway {
    abstract void bookTicket(String passengerName, int numPassengers);
    abstract void cancelTicket(String passengerName);
}

// Concrete Class: SleeperClass
class SleeperClass extends Railway {
    @Override
    void bookTicket(String passengerName, int numPassengers) {
        System.out.println("Sleeper Class Ticket booked for " + passengerName + " with " + numPassengers + " passengers.");
    }

    @Override
    void cancelTicket(String passengerName) {
        System.out.println("Sleeper Class Ticket cancelled for " + passengerName + ".");
    }
}

// Concrete Class: AcClass
class AcClass extends Railway {
    @Override
    void bookTicket(String passengerName, int numPassengers) {
        System.out.println("AC Class Ticket booked for " + passengerName + " with " + numPassengers + " passengers.");
    }

    @Override
    void cancelTicket(String passengerName) {
        System.out.println("AC Class Ticket cancelled for " + passengerName + ".");
    }
}

// Driver Class: RailwayTicketBooking
public class RailwayBookingSystem_userinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Railway railway;

        while (true) {
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter passenger name: ");
                    String passengerName = scanner.next();
                    System.out.print("Enter number of passengers: ");
                    int numPassengers = scanner.nextInt();
                    System.out.print("Enter ticket type (Sleeper/AC): ");
                    String ticketType = scanner.next();

                    if (ticketType.equalsIgnoreCase("Sleeper")) {
                        railway = new SleeperClass();
                    }
                    else if (ticketType.equalsIgnoreCase("AC")) {
                        railway = new AcClass();
                    }
                    else {
                        System.out.println("Invalid ticket type");
                        continue;
                    }

                    railway.bookTicket(passengerName, numPassengers);
                    break;

                case 2:
                    System.out.print("Enter passenger name: ");
                    passengerName = scanner.next();
                    System.out.print("Enter ticket type (Sleeper/AC): ");
                    ticketType = scanner.next();

                    if (ticketType.equalsIgnoreCase("Sleeper")) {
                        railway = new SleeperClass();
                    }
                    else if (ticketType.equalsIgnoreCase("AC")) {
                        railway = new AcClass();
                    }
                    else {
                        System.out.println("Invalid ticket type");
                        continue;
                    }

                    railway.cancelTicket(passengerName);
                    break;

                case 3:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option");

                scanner.close();
            }
        }
    }
}
