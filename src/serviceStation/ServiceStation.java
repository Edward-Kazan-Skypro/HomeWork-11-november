package serviceStation;

import cars.Bus;
import cars.Car;
import cars.PassengerCars;
import cars.Trucks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {

    public ServiceStation() {
    }

    Queue<Car> serviceQueue = new LinkedList<>();

    Trucks trucks;
    PassengerCars passengerCars;
    Bus bus;


    public void addTrucksToQueue (Trucks trucks){
        serviceQueue.offer(trucks);

    }

    public void addPassengerCarsToQueue (PassengerCars passengerCars){
        serviceQueue.offer(passengerCars);
    }

    public void addAllTrucksToQueue (ArrayList<Trucks> trucksList){
        serviceQueue.addAll(trucksList);
    }

    public void addAllPassengerCarsToQueue (ArrayList<PassengerCars> passengerCarsList){
        serviceQueue.addAll(passengerCarsList);
    }


    public void addAllBusToQueue (ArrayList<Bus> busList){
        System.out.println("Автобусы техосмотр не проходят!");
    }

    public void addBusToQueue (Bus bus){
        System.out.println("Автобусы техосмотр не проходят!");
    }

    public void oneVehicleInspection(Car car){
        if (!serviceQueue.isEmpty()){
            System.out.println("В очереди на техобслуживание " + serviceQueue.size() + " машины(-а)");
            System.out.println(serviceQueue);
            System.out.println(car.getModel() + " " + car.getBrand()
                    + " прошел техобслуживание и покинул станцию техобслуживания.");
            serviceQueue.remove(car);
        } else {
            System.out.println("Очередь на техобслуживание пуста, машин нет.");
        }
    }

    public void allTrucksInspection (ArrayList<Trucks> trucksList){
        if (!serviceQueue.isEmpty()){
            for (Car car: trucksList) {
                oneVehicleInspection(car);
            }
        } else {
            System.out.println("Очередь на техобслуживание пуста, машин нет.");
        }
    }

    public void allPassengerCarsInspection (ArrayList<PassengerCars> passengerCars){
        if (!serviceQueue.isEmpty()){
            for (Car car: passengerCars) {
                oneVehicleInspection(car);
            }
        } else {
            System.out.println("Очередь на техобслуживание пуста, машин нет.");
        }
    }

}
