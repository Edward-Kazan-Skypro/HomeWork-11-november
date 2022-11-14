package cars.enums;

public enum CapacityBus {
    SPECIAL_SMALL(0, 10),
    SMALL(0, 25),
    AVERAGE(40, 50),
    BIG(60, 80),
    SPECIAL_BIG(100, 120);

    private final int capacityMin;
    private final int capacityMax;

    CapacityBus(int capacityMin, int capacityMax) {
        this.capacityMin = capacityMin;
        this.capacityMax = capacityMax;
    }

    @Override
    public String toString() {
        String result = "";
        if (capacityMin > 0) {
            result += "от " + capacityMin;
        }
        if (capacityMax > 0) {
            result += " до " + capacityMax + " мест";
        }
        return result;
    }
}
