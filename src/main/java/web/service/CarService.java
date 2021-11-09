package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    public List<String> getListCars(int count){
        List<Car> cars=new ArrayList<>();
        cars.add(new Car("BMW", 1, "Vasia"));
        cars.add(new Car("Audi", 2, "Petya"));
        cars.add(new Car("Skoda", 3, "Kolya"));
        cars.add(new Car("YAZ", 4, "Masha"));
        cars.add(new Car("VOLGA", 5, "Senya"));
        List<String> request = cars.stream().
                limit(count).
                map(x->x.toString()).
                collect(Collectors.toList());
        return request;
    }
}
