public class FlightManager {
    private Flight flight;

    public FlightManager(Flight flight){
        this.flight = flight;
    }

    public int getBaggageAllowance(){
        int baggageCapacity = flight.getPlane().getWeightFromPlaneType()/2;
        int passengerCapacity = flight.getPlane().getCapacityFromPlaneType();
        return baggageCapacity / passengerCapacity;
    }

    public int getBaggageBooked(){
        return this.getBaggageAllowance() * flight.getPassengers().size();
    };
    public int getBaggageAvailable(){
        int baggageCapacity = flight.getPlane().getWeightFromPlaneType()/2;
    return baggageCapacity - this.getBaggageBooked();
    };
}
