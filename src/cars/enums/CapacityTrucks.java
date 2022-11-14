package cars.enums;

public enum CapacityTrucks {
    N1(null, 3.5f),
    N2(3.5f, 12f),
    N3(12f, null);
    private final Float capacityFrom;
    private final Float capacityTo;

    CapacityTrucks(Float capacityFrom, Float capacityTo) {
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
            result += " до " + capacityTo + " тонн";
        }
        return result;
    }
}
