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

    public int getRentsCount() {
        return rents.size();
    }

    public void rent(Item item) {
        rents.add(item);
    }

    public abstract boolean canRent(Item item);

    public void setCardID() {
        cardID = count++;
    }

    public int getCardID() {
        return cardID;
    }

    public ArrayList<Item> getRents() {
        return rents;
    }

}

