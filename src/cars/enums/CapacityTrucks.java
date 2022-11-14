package cars.enums;

public enum CapacityTrucks {
    N1(0, 3.5f),
    N2(3.5f, 12f),
    N3(12f, 0);

    private final float capacityMin;
    private final float capacityMax;

    CapacityTrucks(float capacityMin, float capacityMax) {
        this.capacityMin = capacityMin;
        this.capacityMax = capacityMax;
    }

    @Override
    public String toString() {
        String result = "";
        if (capacityMin > 0){
            result += "от " + capacityMin;
        }
        if (capacityMax > 0) {
            result += " до " + capacityMax + " тонн";
        }
        return result;
    }
}
