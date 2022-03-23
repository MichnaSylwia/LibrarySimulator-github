package pl.edu.agh.qa;


public class Student extends User {
    public static final int MAX_RENT_ITEMS = 4;
    char type = 'S';

    public Student(String firstName, String lastName) {
        super(firstName, lastName);

    }

    @Override
    public boolean canRent(Item item) {
        return false;
    }

    @Override
    public String toString() {
        return firstName + ';' + lastName + ';' + cardID + ';' + type;

    }
}

