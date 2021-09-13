package second.ooconcepts.polimorphism;

public class Superhero {

    public void useAbility() {
        System.out.println("Used some ability");
    }

    //Overloading
    public void useAbility(int times) {
        System.out.println(String.format("Used some ability %d times", times));
    }

   // public int useAbility() {
   //     return 210;
   // }
}
