package pl.edu.agh.qa;


public class Lecturer extends User {
    public static final int MAX_RENTS = 10;
    char type = 'L';

    public Lecturer(String firstName, String lastName) {
        super(firstName, lastName);

    }

    @Override
    public boolean canRent(Item item) {
        return false;
    }

    public String toString() {
        return firstName + ';' + lastName + ';' + cardID + ';' + type;

    }
}
