package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarContorller {
    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam("count") int count) {
        model.addAttribute("message", new CarService().getListCars(count));
        return "cars";
    }
}
