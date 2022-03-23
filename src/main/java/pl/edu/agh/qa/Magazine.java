package pl.edu.agh.qa;

import java.util.Objects;

public class Magazine extends Item {
    String number;

    public Magazine(String number, String title) {
        super(title);
        this.number = number;

    }

    @Override
    public String toString() {
        return String.format("%s;%s", super.toString(), number);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hashCode(this.number);
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
        final Magazine other = (Magazine) obj;
        if (!super.equals(obj) || !this.number.equals(other.number)) {
            return false;
        }
        return true;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }



}
