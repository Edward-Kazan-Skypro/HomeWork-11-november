package cars.enums;

import race.RaceUnit;

import java.util.ArrayList;
import java.util.HashSet;

public enum Sponsors {

    SHELL("Шелл", 100_000),
    MARLBORO("Мальборо", 500_000),
    SONY("Сони", 1_000),
    BILL_GATES ("Билл Гейтс", 1_000_000);

    private final String sponsorName;
    private final int donation;

    private final HashSet <Sponsors> sponsorsSet = new HashSet<>();

    Sponsors(String sponsorName, int donation) {
        this.sponsorName = sponsorName;
        this.donation = donation;
    }

    public void addToSponsorsSet(Sponsors sponsor) {
        sponsorsSet.add(sponsor);
    }

    public HashSet<Sponsors> getSponsorsSet() {
        return sponsorsSet;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public int getDonation() {
        return donation;
    }

    public void donationRace (RaceUnit raceUnit){
        int sumOfDonations = 0;
        for (Sponsors sponsor: sponsorsSet) {
         sumOfDonations += sponsor.getDonation();
        }

        System.out.println("Участник гонок: " + raceUnit.getDriver() +
                " на автомобиле: " + raceUnit.getCar().getModel() + raceUnit.getCar().getModel() +
                " получил финансирование от спонсора(-ов): " + sponsorsSet + "\n" +
                "на сумму " + sumOfDonations);
    }


}
