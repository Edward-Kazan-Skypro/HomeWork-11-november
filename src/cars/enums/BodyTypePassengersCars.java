package cars.enums;

public enum BodyTypePassengersCars {
    SEDAN("Седан"),
    HATCHBACK("Хетчбек"),
    COUPE("Купе"),
    STATION_WAGON("Универсал"),
    OFF_ROADER("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    private final String bodyType;

    BodyTypePassengersCars(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString () {
        return this.bodyType;
    }
}
