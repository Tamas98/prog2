package second.ooconcepts.inheritance.service;

import second.ooconcepts.inheritance.domain.SuperHero;
import second.ooconcepts.polimorphism.Superhero;

/**
 * TODO docme.
 */
public class BasicTrainingCenter implements TrainingCenter {
    @Override
    public void train(SuperHero superhero) {
        System.out.println(String.format("%s is currently trains.", superhero.getName()));
        superhero.setStrength(superhero.getStrength()+1);
    }

    @Override
    public void scoutTheCity(SuperHero superhero) {
        System.out.println(String.format("%s is currently scouting the city.", superhero.getName()));
    }

    @Override
    public void trainAbility(SuperHero superHero) {
        System.out.println(String.format("%s is currently trains his %s ability.", superHero.getName(), superHero.getAbility()));
        superHero.setStrength(superHero.getStrength()+5);
    }

}
