public class Bottle {
    private int volume;


    public Bottle(int volume){
        this.volume = volume;
    }

    public int getVolume() {return this.volume;}
    public int setVolume(int amount) {
        return this.volume -= amount;
    }

    public void drink(){
        this.setVolume(10);
    }

    public void empty(){
        this.setVolume(0);
    }
    public void fill(){
        this.setVolume(100);
    }
}
