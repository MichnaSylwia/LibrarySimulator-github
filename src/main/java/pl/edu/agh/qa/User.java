package pl.edu.agh.qa;

import java.util.ArrayList;

public abstract class User {
    String firstName;
    String lastName;
    private static int count = 1;
    int cardID;
    private final ArrayList<Item> rents = new ArrayList<>();

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;


    }

    public void setCardID() {
        cardID = count++;
    }

    public int getCardID() {
        return this.cardID;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    protected abstract char getUserType();

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof User)) {
            return false;
        } else {
            User other = (User) o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getCardID() != other.getCardID()) {
                return false;
            } else {
                Object this$firstName = this.getFirstName();
                Object other$firstName = other.getFirstName();
                if (this$firstName == null) {
                    if (other$firstName != null) {
                        return false;
                    }
                } else if (!this$firstName.equals(other$firstName)) {
                    return false;
                }

                Object this$lastName = this.getLastName();
                Object other$lastName = other.getLastName();
                if (this$lastName == null) {
                    if (other$lastName != null) {
                        return false;
                    }
                } else if (!this$lastName.equals(other$lastName)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof User;
    }

    public int getRentsCount() {
        return rents.size();
    }

    public void rent(Item item) {
        rents.add(item);
    }

    public abstract boolean canRent(Item item);

    public ArrayList<Item> getRents() {
        return rents;
    }

    public abstract int getMaxRentItems();
}

