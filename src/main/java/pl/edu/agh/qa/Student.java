package pl.edu.agh.qa;


public class Student extends User {
    public Student(String firstName, String lastName) {
        super(firstName, lastName);

    }

    @Override
    protected char getUserType() {
        return 'S';
    }

    public int getMaxRentItems() {
        return 4;
    }

    @Override
    public boolean canRent(Item item) {
        return false;
    }

    @Override
    public String toString() {
        return firstName + ';' + lastName + ';' + cardID + ';' + getUserType();

    }
}

