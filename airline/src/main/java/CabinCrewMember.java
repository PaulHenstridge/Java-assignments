public class CabinCrewMember extends Person{
    private String rank;

    public CabinCrewMember(String name, String rank){
        super(name);
        this.rank = rank;
    }

    public String makeAnnouncement(){
        return"Buy my fags and booze you fat sun-burnt idiots.";
    }
}
