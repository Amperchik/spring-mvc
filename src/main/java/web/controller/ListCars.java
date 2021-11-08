package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ListCars {
    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam("count") int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 1, "Vasia"));
        cars.add(new Car("Audi", 2, "Petya"));
        cars.add(new Car("Skoda", 3, "Kolya"));
        cars.add(new Car("YAZ", 4, "Masha"));
        cars.add(new Car("VOLGA", 5, "Senya"));
        List<String> request = cars.stream().
                limit(count).
                map(x->x.toString()).
                collect(Collectors.toList());
        model.addAttribute("message", request);
        return "cars";
    }
}
