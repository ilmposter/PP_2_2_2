package web.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2020));
        cars.add(new Car("BMW", "X5", 2019));
        cars.add(new Car("Honda", "Accord", 2021));
        cars.add(new Car("Ford", "Mustang", 2018));
        cars.add(new Car("Tesla", "Model S", 2022));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= cars.size() || count <= 0) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
