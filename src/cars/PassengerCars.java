package cars;

import cars.enums.BodyTypePassengersCars;

public class PassengerCars extends Car implements race.Competing {

    /*Вначале хотел указать в конструкторе текстовую переменную (String inputBodyType),
    чтобы по ее содержимому шел поиск в перечислении,
    и, если вводимое название (например, "Седан") совпадает с элементом перечисления,
    то создается объект с типом кузова, указанным в перечислении.
    Иначе, тип кузова будет "не указан" и, соответственно, можно будет
    вывести сообщение "Данных по авто недостаточно."
    Но отказался от этой идеи, т.к. грузовики и автобусы не имеют "имени",
    более того, при их создании надо указывать один-два цифровых параметра,
    а не понятное название типа кузова.
    В общем, не стал нарушать единообразие и надежность создания объектов транспортных средств.*/
    private final BodyTypePassengersCars bodyType;

    public PassengerCars(String brand, String model, double engineVolume, BodyTypePassengersCars inputBodyType) {
        super(brand, model, engineVolume);
        bodyType = inputBodyType;
    }

   public BodyTypePassengersCars getBodyType() {
        return bodyType;
    }

    public void printBodyType() {
        if (this.bodyType == null) {
            System.out.println("Данных по авто недостаточно.");
        } else {
            System.out.println("Тип кузова легкового автомобиля " + getBrand() + " " + getModel() + ": " + this.bodyType);
        }
    }

    @Override
    public void start() {
        System.out.print("Легковой автомобиль ");
        super.start();
    }

    @Override
    public void stop() {
        System.out.print("Легковой автомобиль ");
        super.stop();
    }

    @Override
    public void pitStop() {
        System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() + " заехал на пит-стоп.");
    }

    @Override
    public void bestTime() {
        System.out.print("Легковой автомобиль " + getBrand() + " " + getModel() + " показал лучшее время за круг: ");
        System.out.println((int) (Math.random() * 100 + 1) + " минут.");
    }

    @Override
    public void maxSpeed() {
        System.out.print("Легковой автомобиль " + getBrand() + " " + getModel() + " достиг максимальной скорости в ");
        System.out.println((int) (Math.random() * 100 + 1) + " км/час.");
    }

    public boolean diagnosticCar() {
        return Math.random() > 0.5;
    }

    @Override
    public String toString () {
        return "Легковой автомобиль - " + super.toString() + ", тип кузова:" + this.getBodyType();
    }
}
