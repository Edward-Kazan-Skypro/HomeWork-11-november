package cars.enums;

public enum CapacityBus {
    SPECIAL_SMALL(null, 10),
    SMALL(null, 25),
    AVERAGE(40,50),
    BIG(60,80),
    SPECIAL_BIG(100,120);

    private final Integer capacityMin;
    private final Integer capacityMax;

    CapacityBus(Integer capacityMin, Integer capacityMax) {
        this.capacityMin = capacityMin;
        this.capacityMax = capacityMax;
    }

    @Override
    public String toString() {
        String result = "";
        if (capacityMin != null){
            result += "от " + capacityMin;
        }
        if (capacityMax != null) {
            result += " до " + capacityMax + " мест";
        }
        return result;
    }
}
