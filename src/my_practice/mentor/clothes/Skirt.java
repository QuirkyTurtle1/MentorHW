package my_practice.mentor.clothes;

public class Skirt extends Clothing implements WomenClothing{
    public Skirt(ClothingSize clothingSize, int price, String color) {
        super(clothingSize, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская юбка " + this);
    }
}
