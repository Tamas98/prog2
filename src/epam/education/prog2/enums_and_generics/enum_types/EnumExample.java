package epam.education.prog2.enums_and_generics.enum_types;

/**
 * TODO docme.
 */
public class EnumExample {
    public static void main(String[] args) {
        for(Day d: Day.values()) {
            String text = String.format("%s is the %d. day of the week in Hungary", d.getNameOfTheDay(), d.getOrder());
            System.out.println(text);
        }
        //Day day = Day.valueOf("Monday");
        Day day2 = Day.TUESDAY;
        System.out.println(day2.getOrder());
    }
}
