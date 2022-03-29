package pl.edu.agh.qa;

public class ItemDetails {
    private int totalQuantity;
    private int currentQuantity;

    public ItemDetails() {
        this(1, 1);
    }

    public void decreaseCurrentQuantity() {
        if (this.currentQuantity > 0) {
            --this.currentQuantity;
        }

    }

    public void increaseQuantity() {
        ++this.totalQuantity;
        ++this.currentQuantity;
    }

    public int getTotalQuantity() {
        return this.totalQuantity;
    }

    public int getCurrentQuantity() {
        return this.currentQuantity;
    }

    public ItemDetails(int totalQuantity, int currentQuantity) {
        this.totalQuantity = totalQuantity;
        this.currentQuantity = currentQuantity;
    }
}