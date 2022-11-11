package race;

//Не совсем понял необходимость интерфейса в этом задании.
//Если бы стояла задача написать код для гонок на разных автомобилях,
//то да, можно было создать сущность "Гонка" (в виде класса), добавив в нее несколько пар водитель+машина.
//И для сущности "Гонка" имеют смысл указанные в этом интерфейсе методы,
//а использование их в классе "Car" мне не понятно.

public interface Competing {

    void pitStop();

    void bestTime();

    void maxSpeed();

}
