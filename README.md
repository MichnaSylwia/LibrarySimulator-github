
## Software Requirements Specification for Library Simulator


### Step 1
1. Ability to add new library users. Users are divided into two types:
   Student - can borrow up to 4 books or magazines at a time
   Lecturer - can borrow up to 10 books or magazines at a time


2. Each user must have a name and card number in the library. There can be two
   users with the same first and last name but the library card number must be unique. The card number is automatically generated when the user is added to the library - its format doesn’t matter.


3. The ability to list all library users. Each line is for a different user and includes (in the following order, separated by semicolons) first name, last name, library card number, type. The type can be “S” if the user is a student or “L” if the user is a lecturer.

   ```
   John;Smith;21;L
   Peter;Novak;13;S
   Jennifer;Wilson;11;S
   ```

### Step 2
1. Ability to add two types of items to the library collection:
   Book - each must have a title and author
   Magazine - each must have a title, and a magazine number
   If an existing book or magazine is being added, the number of all available copies of that book/magazine should increase. The method for adding books and magazines should be able to add one or more types of items regardless of the type (book, magazine).


2. Possibility to lend books and magazines to a user if there are a sufficient number of items to be borrowed and the user has the possibility to borrow another item.


3. Possibility to write on the screen a list of books and magazines.


4. Ability to list all Magazines from the library on the screen. Each line is for one issue and contains (in the following order, separated by semicolons) the title, number, total number of items, and number of available copies.
   ````
   Traveler;03/2017;30;17
   National Geographic;01/2016;15;1
   ````
5. The ability to list all the books in the library on the screen. Each line is for one title
   and contains (in the following order, separated by semicolons) the title, author, number of total copies and number of available copies.
   ````
   Heart of Darkness;J. Conrad;20;7
   The Bourne Identity;R. Ludlum;40;33
   ````

6. Ability to add a list of books/magazines from a text file. Each line in the file should contain title, author/number, number of copies to add and type (B - book, M - magazine) separated by semicolon. If there are already some books in the library from the text file then we increase the number of copies for these items.


7. Ability to save to a new file the card numbers of those library users who have
   borrowed copies and for each user the titles and author of the books or the titles and
   numbers of the magazine they own. If someone has several copies of the same book or magazine it should be displayed several times.
   