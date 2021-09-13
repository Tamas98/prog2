package second.ooconcepts.polimorphism;

// Create a new hero!
public class PolimorphismExample {
    public static void main(String[] args) {
        PeopleSavingService peopleSavingService = new PeopleSavingService();
        Superhero batman = new SpiderMan();
        Superhero superman = new SuperMan();

        peopleSavingService.savePeople(batman);
        System.out.println();
        peopleSavingService.savePeople(superman);
    }
}
