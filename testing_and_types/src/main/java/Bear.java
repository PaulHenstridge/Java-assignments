public class Bear {
    private int weight;
    private String name;
    private int age;

    public Bear(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }


    public int getAge() {
        return this.age;
    }


    public int getWeight() {
        return this.weight;
    }

    public boolean readyToHibernate() {
        if(this.weight >= 80){
            return true;
        }
        return false;
    }
}
