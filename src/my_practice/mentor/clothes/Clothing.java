package my_practice.mentor.clothes;

public abstract class Clothing {
    private ClothingSize clothingSize;
    private int price;
    private String color;

    public Clothing(ClothingSize clothingSize, int price, String color) {
        this.clothingSize = clothingSize;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "clothingSize=" + clothingSize +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
