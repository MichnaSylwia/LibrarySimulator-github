package pl.edu.agh.qa;

public class ItemDetails {
    private int totalQuantity;
    private int currentQuantity;

    public ItemDetails() {
        this(1, 1);
    }

    private ItemDetails(int totalQuantity, int currentQuantity) {
        this.totalQuantity = totalQuantity;
        this.currentQuantity = currentQuantity;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public void decreaseCurrentQuantity() {
        this.currentQuantity = currentQuantity--;
    }

    void increaseQuantity() {
        this.currentQuantity++;
        this.totalQuantity++;
    }
}
