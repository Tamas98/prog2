package second.ooconcepts.polimorphism;

/**
 * TODO docme.
 */
public class PeopleSavingService {

    public void savePeople(Superhero superhero) {
        System.out.println("There are 10 people at trouble.");
        superhero.useAbility();
        System.out.println("The problem is not solved yet");
        superhero.useAbility(10);
    }
}
