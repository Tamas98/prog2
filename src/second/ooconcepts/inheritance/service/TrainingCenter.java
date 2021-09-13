package second.ooconcepts.inheritance.service;

import second.ooconcepts.inheritance.domain.SuperHero;
import second.ooconcepts.polimorphism.Superhero;

/**
 * TODO docme.
 */
public interface TrainingCenter {
    void train(SuperHero superhero);

    void scoutTheCity(SuperHero superhero);

    void trainAbility(SuperHero superHero);
}
