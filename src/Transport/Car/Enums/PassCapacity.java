package Transport.Car.Enums;

public enum PassCapacity {
    VERY_SMALL(10),
    SMALL(25),
    MEDIUM(50),
    BIG(80),
    VERY_BIG(120),
    UNDEFINED(0);

    public final int to;

    PassCapacity(int to) {
        this.to = to;
    }

    public final PassCapacity checkCapacityTo(int capacityTo) {
        for (PassCapacity capacity : PassCapacity.values()) {
            if (capacityTo <= capacity.getTo()) {
                return capacity;
            }
        }
        return UNDEFINED;
    }

    private int getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "PassCapacity{" +
                "to=" + to +
                '}';
    }
}
