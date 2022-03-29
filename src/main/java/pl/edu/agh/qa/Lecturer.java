package pl.edu.agh.qa;


public class Lecturer extends User {

    public Lecturer(String firstName, String lastName) {
        super(firstName, lastName);

    }

    @Override
    protected char getUserType() {
        return 'L';
    }

    public int getMaxRentItems() {
        return 10;
    }

    @Override
    public boolean canRent(Item item) {
        return false;
    }

    public String toString() {
        return firstName + ';' + lastName + ';' + cardID + ';' + getUserType();

    }
}
