public class Pilot extends CabinCrewMember{
    private String licenceNumber;

    public Pilot(String name, String rank,String licenceNumber ){
        super(name, rank);
        this.licenceNumber = licenceNumber;
    }

    //constructor overloading - allowing a pilot to be created with no licence
    public Pilot(String name, String rank) {
        super(name, rank);
        this.licenceNumber = null;
    }

    public String checkLicence(){
        if(this.licenceNumber == null){
            return "I don't know how to fly this thing!";
        } else {
            return "Let's Fly!";
        }
    }
}
