import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Pilot pilot;
    CabinCrewMember crew1;
    CabinCrewMember crew2;

    Passenger passenger1;
    ArrayList<Passenger> passengerList;
    ArrayList<CabinCrewMember> crewList;

    Plane aeroplane;
    Flight flight1;

    @Before
    public void before(){
    pilot = new Pilot("Steve Flyman", "Commander", "3847574945XQ");
    crew1 = new CabinCrewMember("Stacey Giggles", "Flight Attendant");
    crew2 = new CabinCrewMember("Barry Shitpeas", "Flight Attendant");
    passenger1 = new Passenger("Marjory McIdiot", 2);
    aeroplane = new Plane(PlaneType.CESSNA);
    passengerList = new ArrayList<>();
    crewList = new ArrayList<>();
    crewList.add(crew1);
    crewList.add(crew2);

    flight1 = new Flight(pilot,crewList, passengerList,aeroplane,"AB123","JFK", "EDI","11.25" );
    }


    @Test
    public void getAvailableSeatsEmpty(){
        assertEquals(4,flight1.getSeatsAvailable());
    }
    @Test
    public void getAvailableSeatsNotEmpty(){
        passengerList.add(passenger1);
        assertEquals(3,flight1.getSeatsAvailable());
    }
    @Test
    public void CheckInPassenger(){
        flight1.bookPassenger(passenger1);
        assertEquals(1, flight1.getPassengers().size());
    }
}
