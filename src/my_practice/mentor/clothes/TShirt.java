package my_practice.mentor.clothes;

public class TShirt extends Clothing implements  MenClothing, WomenClothing{
    public TShirt(ClothingSize clothingSize, int price, String color) {
        super(clothingSize, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужская футболка "+ this);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская футболка "+ this);
    }
}
