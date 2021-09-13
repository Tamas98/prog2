package second.ooconcepts.inheritance;

import second.ooconcepts.inheritance.domain.SuperHero;
import second.ooconcepts.inheritance.service.BasicTrainingCenter;
import second.ooconcepts.inheritance.service.TrainingCenter;
import second.ooconcepts.polimorphism.Superhero;

/**
 * TODO docme.
 */
public class InheritanceExample {
    public static void main(String[] args) {
        SuperHero spiderMan = new SuperHero("Spider-Man", 18, "Webs", "Spidey", 60);

        TrainingCenter basicTrainingCenter = new BasicTrainingCenter();

        basicTrainingCenter.train(spiderMan);
        basicTrainingCenter.scoutTheCity(spiderMan);
        basicTrainingCenter.trainAbility(spiderMan);
    }
}
