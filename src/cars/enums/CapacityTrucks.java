package cars.enums;

public enum CapacityTrucks {
    N1(null, 3.5f),
    N2(3.5f, 12f),
    N3(12f, null);
    private final Float capacityMin;
    private final Float capacityMax;

    CapacityTrucks(Float capacityMin, Float capacityMax) {
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
            result += " до " + capacityMax + " тонн";
        }
        return result;
    }
}
