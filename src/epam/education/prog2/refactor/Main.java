package epam.education.prog2.refactor;

/**
 * TODO docme.
 */
public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService();
        PrintService printService = new PrintService();
        carService.c();
        carService.plantATree();
        carService.constructCar();
        carService.absolutelyUsefulMethod();
        printService.myPrint("Hello There");
    }
}
