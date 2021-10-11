package epam.education.prog2.enums_and_generics.enum_types;

/**
 * TODO docme.
 */
public enum Day {

    MONDAY("Monday", 1), TUESDAY("Tuesday", 2), WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4), FRIDAY("Friday", 5), SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);

    private final String nameOfTheDay;
    private final int order;

    Day(String nameOfTheDay, int order) {
        this.nameOfTheDay = nameOfTheDay;
        this.order = order;
    }

    public String getNameOfTheDay() {
        return nameOfTheDay;
    }

    public int getOrder() {
        return order;
    }
}
