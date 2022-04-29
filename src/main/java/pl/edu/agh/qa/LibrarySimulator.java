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
        Book item1 = new Book("J.Conrad", "Heart of Darkness");
        Magazine item2 = new Magazine("01/2022", "National Geographic");
        Book item3 = new Book("J.Conrad", "Heart of Darkness");
        Magazine item4 = new Magazine("01/2022", "National Geographic");
        Book item5 = new Book("R. Ludlum", "The Bourne Identity");
        Magazine item6 = new Magazine("07/2017", "Scientific American");
        Magazine item7 = new Magazine("03/2015", "Reader's Digest");
        Magazine item8 = new Magazine("10/2021", "Sports Illustrated");
        Magazine item9 = new Magazine("02/2022", "The American Legion Magazine");
        Book item10 = new Book("L.Foley", "The Paris Apartment");
        Book item11 = new Book("M.Sadler", "It’s Not Easy Being a Bunny");
        Book item12 = new Book("M.Sadler", "It’s Not Easy Being a Bunny");

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

    /*
    Test: Import items from file import_items.txt
    library.importItemsFromFile("import_items.txt");
    */


        //rent items to users
        library.rentItem(item1, user1);
        library.rentItem(item2, user1);
        library.rentItem(item1, user2);

        library.exportUsersWithItemsToFile("users_with_items.txt");


    }
}
