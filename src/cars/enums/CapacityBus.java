package cars.enums;

public enum CapacityBus {
    SPECIAL_SMALL(null, 10),
    SMALL(null, 25),
    AVERAGE(40,50),
    BIG(60,80),
    SPECIAL_BIG(100,120);

    private final Integer capacityFrom;
    private final Integer capacityTo;

    CapacityBus(Integer capacityFrom, Integer capacityTo) {
        this.capacityFrom = capacityFrom;
        this.capacityTo = capacityTo;
    }

    @Override
    public String toString() {
        String result = "";
        if (capacityFrom != null){
            result += "от " + capacityFrom;
        }
        if (capacityTo != null) {
            result += " до " + capacityTo + " мест";
        }
        return result;
    }
}
