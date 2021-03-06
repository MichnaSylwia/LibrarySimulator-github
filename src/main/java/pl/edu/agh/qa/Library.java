package pl.edu.agh.qa;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;


public class Library {

    private final ArrayList<User> users = new ArrayList<>();
    private final Map<User, List<Item>> userItems = new HashMap();
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
            if (this.items.containsKey(item)) {
                ((ItemDetails) this.items.get(item)).increaseQuantity();
            } else {
                this.items.put(item, new ItemDetails());
            }
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
                                entry.getValue().getTotalQuantity(),
                                entry.getValue().getCurrentQuantity())

                ).forEach(System.out::println);
    }

    private boolean isCurrentItemsQuantityNotEmpty(Item item) {
        return ((ItemDetails) this.items.get(item)).getCurrentQuantity() > 0;
    }

    private boolean isUserCanRentOneMoreItem(User user) {
        return user.getMaxRentItems() > ((List) this.userItems.getOrDefault(user, Collections.emptyList())).size();
    }

    private boolean isCanRent(Item item, User user) {
        return this.isCurrentItemsQuantityNotEmpty(item) && this.isUserCanRentOneMoreItem(user);
    }

    public void rentItem(Item item, User user) {
        if (this.isCanRent(item, user)) {
            ((ItemDetails) this.items.get(item)).decreaseCurrentQuantity();
            ((List) this.userItems.computeIfAbsent(user, (u) -> {
                return new ArrayList();
            })).add(item);
        }

    }

    public Map<Item, ItemDetails> getItems() {
        return this.items;
    }

    public Map<User, List<Item>> getUserItems() {
        return this.userItems;
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
        try {
            Files.readAllLines(Paths.get(csvFile)).stream()
                    .forEach((str) ->
                    {
                        Scanner sc = new Scanner(str).useDelimiter(";");
                        String title = sc.next();
                        String authNmb = sc.next();
                        int quantity = sc.nextInt();

                        Item newItem = sc.next().equals("B") ?
                                new Book(authNmb, title) : new Magazine(authNmb, title);
                        addManyItemsToLibrary(newItem, quantity);
                    });
        } catch (IOException ex) {
            System.out.println("Not able to read the file");
        }
    }

    public void exportUsersWithItemsToFile(String csvFile) {
        String FILE_PATH = "users_with_items.txt";
        Path filePath = Paths.get(FILE_PATH);

        try {
            Files.writeString(filePath, textToAddToFile(userItems), StandardOpenOption.CREATE);
        } catch (IOException e) {
            System.out.println("Unable to add text to the file");
        }
    }

    public String textToAddToFile(Map userItems) {
        String text = null;
        while (userItems.size() > 0) {
            text = userItems.entrySet().toString();
            break;
        }
        return text;
    }
}

