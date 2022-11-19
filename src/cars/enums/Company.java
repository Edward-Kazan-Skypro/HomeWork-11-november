package cars.enums;

public enum Company {

    SPEED_WAY("Быстрое колесо"),
    SMILE_HAMMER("Веселый молоток"),
    HARD_WORK("Трудная работа");

    private final String companyName;

    Company(String companyName) {
        this.companyName = companyName;
    }
}
