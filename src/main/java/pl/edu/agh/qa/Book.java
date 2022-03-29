package pl.edu.agh.qa;

import java.util.Objects;

public class Book extends Item {
    private final String author;


    public Book(String author, String title) {
        super(title);
        this.author = author;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hashCode(this.author);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!super.equals(obj) || !this.author.equals(other.author)) {
            return false;
        }
        return true;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Book;
    }

    @Override
    public String toString() {
        return String.format("%s;%s", super.toString(), author);
    }

    public String getAuthor() {
        return author;
    }
}
