package my_practice.mentor.clothes;

public class Tie extends Clothing implements MenClothing{
    public Tie(ClothingSize clothingSize, int price, String color) {
        super(clothingSize, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужской галстук " + this);
    }
}
