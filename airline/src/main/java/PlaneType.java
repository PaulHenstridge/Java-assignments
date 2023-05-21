public enum PlaneType {
    SPITFIRE(1,200),
    CESSNA (4, 800),
    BOEING747 (300, 12000),
    BOEING787 (600, 24000);

    private final int capacity;
    private final int weight;


    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
