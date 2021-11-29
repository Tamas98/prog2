package epam.education.prog2.refactor;

import epam.education.prog2.refactor.domain.Car;
import epam.education.prog2.refactor.domain.Person;

/**
 * TODO docme.
 */
public interface ICanDoAnything {
    Car constructCar();
    void changeCarOwner(Car car, Person person);
    void plantATree();
    void c();
}
