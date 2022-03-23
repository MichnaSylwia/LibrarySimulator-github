package pl.edu.agh.qa;

import java.util.*;


public class Library {

    private final ArrayList<User> users = new ArrayList<>();
    private final HashMap<Item, ItemDetails> items = new HashMap<>();

    private boolean canBeRented(Item item) {
        return items.get(item).getCurrentQuantity() > 0;
    }

    private boolean canRent(Item item, User user) {
        return canBeRented(item) && user.canRent(item);
    }

    public Library() {
    }

    public void addUserToLibrary(User user) {
        user.setCardID();
        users.add(user);

    }

    public void addManyItemsToLibrary(Item item, int quantity) {
        for (int i = 0; i < quantity; i++) {
            addItemToLibrary(item);
        }
    }

    public void addItemToLibrary(Item item) {
        if (items.containsKey(item)) {
            items.get(item).increaseQuantity();
        } else {
            items.put(item, new ItemDetails());
        }
    }

    private <T extends Item> void printListOf(Class<T> classs) {
        items.entrySet().stream().filter(entry -> entry.getKey().getClass().equals(classs))
                .map((entry) ->

                        String.format("%s;%d;%d",
                                entry.getKey(),
                                entry.getValue().getCurrentQuantity(),
                                entry.getValue().getTotalQuantity())

                ).forEach(System.out::println);
    }


    public boolean rentItemToUser(Item item, User user) {
        if (canRent(item, user)) {
            user.rent(item);
            items.get(item).decreaseCurrentQuantity();
            return true;
        }
        return false;
    }


    public void printListOfMagazines() {
        printListOf(Magazine.class);
    }

    public void printListOfBooks() {
        printListOf(Book.class);
    }

    public void printListOfUsers() {
        users.forEach(System.out::println);
    }

    public void importItemsFromFile(String csvFile) {
    }

    public void exportUsersWithItemsToFile(String csvFile) {
    }
}
