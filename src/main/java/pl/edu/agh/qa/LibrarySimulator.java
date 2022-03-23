package pl.edu.agh.qa;

public class LibrarySimulator {
    public static void main(String[] args) {

        Library library = new Library();

//list of users
        final Student user1 = new Student("John", "Wilson");
        final Student user2 = new Student("Jennifer", "Brown");
        final Lecturer user3 = new Lecturer("Felix", "Smart");
        final Lecturer user4 = new Lecturer("Felix", "Smart");

//list of items
        Item item1 = new Book("J.Conrad", "Heart of Darkness");
        Item item2 = new Magazine("01/2022", "National Geographic");
        Item item3 = new Book("J.Conrad", "Heart of Darkness");
        Item item4 = new Magazine("01/2022", "National Geographic");
        Item item5 = new Book("R. Ludlum", "The Bourne Identity");
        Item item6 = new Magazine("07/2017", "Scientific American");
        Item item7 = new Magazine("03/2015", "Reader's Digest");
        Item item8 = new Magazine("10/2021", "Sports Illustrated");
        Item item9 = new Magazine("02/2022", "The American Legion Magazine");
        Item item10 = new Book("L.Foley", "The Paris Apartment");
        Item item11 = new Book("M.Sadler", "It’s Not Easy Being a Bunny");
        Item item12 = new Book("M.Sadler", "It’s Not Easy Being a Bunny");

//add user to Library
        library.addUserToLibrary(user1);
        library.addUserToLibrary(user2);
        library.addUserToLibrary(user3);
        library.addUserToLibrary(user4);

//add single item to Library
        library.addItemToLibrary(item1);
        library.addItemToLibrary(item2);
        library.addItemToLibrary(item3);
        library.addItemToLibrary(item4);
        library.addItemToLibrary(item11);
        library.addItemToLibrary(item12);

//add many items to Library
        library.addManyItemsToLibrary(item5, 30);
        library.addManyItemsToLibrary(item4, 25);
        library.addManyItemsToLibrary(item6, 9);
        library.addManyItemsToLibrary(item7, 22);
        library.addManyItemsToLibrary(item8, 12);
        library.addManyItemsToLibrary(item9, 6);
        library.addManyItemsToLibrary(item10, 21);

// rent item to user
        library.rentItemToUser(item1,user3);
        user3.getRents();




    }
}
