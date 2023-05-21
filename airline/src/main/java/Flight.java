import java.util.ArrayList;
import java.util.Random;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrewMember> crew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departure;
    private String departTime;

    public Flight(Pilot pilot, ArrayList<CabinCrewMember> crew, ArrayList<Passenger> passengers, Plane plane, String flightNumber, String destination, String departure, String departTime){
        this.pilot = pilot;
        this.crew = crew;
        this.passengers = passengers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
        this.departTime = departTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public ArrayList<CabinCrewMember> getCrew() {
        return crew;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDepartTime() {
        return departTime;
    }

    public int getSeatsAvailable(){
        return plane.getCapacityFromPlaneType() - passengers.size();
    };

    public void bookPassenger(Passenger passenger){
        this.passengers.add(passenger);
        passenger.setSeatNumber(this.generateSeatNumber());
    };

    //generateSeatNumber()
    //call it and add number to Passenger with setter.
    // from where...? book passenger? separation of concerns?

    public int generateSeatNumber(){
        Random rand = new Random();
        int seatNum = rand.nextInt(plane.getCapacityFromPlaneType())+1;
        for( Passenger passenger : this.passengers){
            if(passenger.getSeatNumber() == seatNum) {
                this.generateSeatNumber();
            }
        }
        return seatNum;
    }
}
// loop over passengerList, check seat nums