package pl.edu.agh.qa;

import java.util.Objects;

public class Item {
    String title;


    public Item(String title) {
        this.title = title;

    }

    public String getTitle() {
        return title;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 35 * hash + Objects.hashCode(this.title);
        return hash;
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
        final Item other = (Item) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return title;
    }

}



