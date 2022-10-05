package racingcar.domain;

import racingcar.ui.ConsoleMessage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cars {

    private static final String DELIMITER = ",";

    private final List<Car> cars;

    public Cars(String names) {
        verifyNames(names);
        cars = toList(names);
    }

    Car getCar(int index) {
        return cars.get(index);
    }

    public int getCarCount() {
        return cars.size();
    }

    private void verifyNames(String names) {
        if (isValid(names)) {
            throw new IllegalArgumentException(ConsoleMessage.CARS_INVALID_NAMES_ERROR.getMessage());
        }
        if (isDuplicatedNames(names)) {
            throw new IllegalArgumentException(ConsoleMessage.CARS_DUPLICATED_NAMES_ERROR.getMessage());
        }
    }

    private boolean isValid(String names) {
        return !names.matches("([\\w]+,)*([\\w]+,[\\w]+)");
    }

    private boolean isDuplicatedNames(String names) {
        String[] allNames = names.split(DELIMITER);
        Set<String> uniqueNames = new HashSet<>();
        for (String name : allNames) {
            uniqueNames.add(name.trim());
        }
        return allNames.length != uniqueNames.size();
    }

    private List<Car> toList(String names) {
        List<Car> cars = new ArrayList<>();
        for (String name : names.split(DELIMITER)) {
            cars.add(new Car(name.trim()));
        }
        return cars;
    }
}
