package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarService {
    List<Car> cars;

    public CarService() {
        this.cars = new ArrayList<>();
    }

    public List<String> getListCars(int count){
        cars.add(new Car("BMW", 1, "owner1"));
        cars.add(new Car("Audi", 2, "owner2"));
        cars.add(new Car("Mercedes", 3, "owner3"));
        cars.add(new Car("YAZ", 4, "owner4"));
        cars.add(new Car("VOLGA", 5, "owner5"));
        return cars.stream().
                limit(count).
                map(Car::toString).
                collect(Collectors.toList());
    }
}
