package epam.education.prog2.refactor;

import epam.education.prog2.refactor.domain.Car;
import epam.education.prog2.refactor.domain.Person;

/**
 * TODO docme.
 */
public class CarService implements ICanDoAnything {
    @Override
    public Car constructCar() {
        return new Car();
    }

    @Override
    public void changeCarOwner(Car car, Person person) {
        car.ownerName = person.name;
        person.money = person.money - car.value;
    }

    @Override
    public void plantATree() {
        System.out.println("I'm planting a tree.");
    }

    @Override
    public void c() {
        System.out.println("I have no idea what I'm doing");
    }

    public void absolutelyUsefulMethod() {
        System.out.println("Hello There");
    }
}
