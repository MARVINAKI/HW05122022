package Transport.Car.Enums;

public enum LoadCapacity {
    N1(0, 3.5d),
    N2(3.5d, 12d),
    N3(12d, 100),
    UNDEFINED(0, 0);

    private final double from;
    private final double to;

    LoadCapacity(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public final LoadCapacity checkTruckCap(double loadCapacity) {
        LoadCapacity cap = LoadCapacity.UNDEFINED;
        for (LoadCapacity capacity : LoadCapacity.values()) {
            if (loadCapacity > capacity.getFrom() && loadCapacity <= capacity.getTo()) {
                return capacity;
            }
        }
        return cap;
    }

    private double getFrom() {
        return from;
    }

    private double getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "LoadCapacity{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }
}
