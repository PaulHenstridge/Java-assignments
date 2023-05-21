public class Passenger extends Person{

    private int bags;
    private int seatNumber;

    public Passenger(String name, int bags){
        super(name);
        this.bags = bags;
        this.seatNumber = 0;
    }

    public int getBags() {
        return bags;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}
